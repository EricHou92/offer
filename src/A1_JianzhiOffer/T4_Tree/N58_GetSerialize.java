package A1_JianzhiOffer.T4_Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ciciya
 * 1. 对于序列化：使用前序遍历，递归的将二叉树的值转化为字符，
 *    并且在每次二叉树的结点不为空时，在转化val所得的字符之后添加一个','作为分割。
 *    对于空节点则以 'null' 代替。
 * 2. 对于反序列化：按照前序顺序，递归的使用字符串中的字符创建一个二叉树
 */
public class N58_GetSerialize {

	//请实现两个函数，分别用来序列化和反序列化二叉树
	public String serialize(TreeNode root) {
		if(root == null){
			return "null,";
		}
		String res = root.val + ",";
		res += serialize(root.left);
		res += serialize(root.right);
		return res;
	}

	public TreeNode deserialize(String data) {
		String[] dataArray = data.split(",");
		List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
		return helper(dataList);
	}

	public TreeNode helper(List<String> dataList) {
		if (dataList.get(0).equals("null")) {
			dataList.remove(0);
			return null;
		}
		TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
		dataList.remove(0);
		root.left = helper(dataList);
		root.right = helper(dataList);
		return root;
	}
}
