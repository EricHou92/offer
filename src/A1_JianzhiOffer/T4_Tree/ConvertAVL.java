package A1_JianzhiOffer.T4_Tree;

public class ConvertAVL {
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(18);
		TreeNode node2 = new TreeNode(10);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(15);
		TreeNode node6 = new TreeNode(22);
		TreeNode node7 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		node4.right = node7;
		ConvertAVL converntAVL = new ConvertAVL();
		TreeNode result = converntAVL.Convert(node1);
		System.out.println(result.val);
	}

	public TreeNode Convert(TreeNode root) {
		if(root==null)
			return null;
		if(root.left==null&&root.right==null)
			return root;
		// 1.将左子树构造成双链表，并返回链表头节点
		TreeNode left = Convert(root.left);
		TreeNode p = left;
		// 2.定位至左子树双链表最后一个节点
		while(p!=null&&p.right!=null){
			p = p.right;
		}
		// 3.如果左子树链表不为空的话，将当前root追加到左子树链表
		if(left!=null){
			p.right = root;
			root.left = p;
		}
		// 4.将右子树构造成双链表，并返回链表头节点
		TreeNode right = Convert(root.right);
		// 5.如果右子树链表不为空的话，将该链表追加到root节点之后
		if(right!=null){
			right.left = root;
			root.right = right;
		}
		return left!=null?left:root;
	}

}
