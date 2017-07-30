package A1_JianzhiOffer.T4_Tree;

//思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
//     所以，按照中序遍历顺序找到第k大个结点就是结果。

public class N59_GetKthNode {

	int index = 0; //计数器
	public TreeNode KMaxNode(TreeNode root, int k) {
		if(root != null){ //中序遍历寻找第k个
			TreeNode node = KMaxNode(root.left, k);
			if(node != null)
				return node;
			index++;
			if(index == k)
				return root;
			node = KMaxNode(root.right, k);
			if(node != null)
				return node;
		}
		return null;
	}
}
