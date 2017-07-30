package A1_JianzhiOffer.T4_Tree;

/**
 * @author ciciya
 * 1. 对于序列化：使用前序遍历，递归的将二叉树的值转化为字符，
 *    并且在每次二叉树的结点不为空时，在转化val所得的字符之后添加一个' ， '作为分割。
 *    对于空节点则以 '#' 代替。
 * 2. 对于反序列化：按照前序顺序，递归的使用字符串中的字符创建一个二叉树
 */
public class N58_GetSerialize {

	public String Serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		if(root == null){
			sb.append("#,");
			return sb.toString();
		}
		//前序遍历
		sb.append(root.val + ",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}

	private int index = -1;
	public TreeNode Deserialize(String str) {
		index++;
		if(index >= str.length())
			return null;
		String[] strs = str.split(",");
		TreeNode root = null;
		if(!strs[index].equals("#")){
			root = new TreeNode(Integer.valueOf(strs[index]));
			root.left = Deserialize(str);
			root.right = Deserialize(str);
		}
		return root;
	}
}
