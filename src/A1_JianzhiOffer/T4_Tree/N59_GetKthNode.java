package A1_JianzhiOffer.T4_Tree;

public class N59_GetKthNode {

	//给定一颗二叉搜索树，请找出其中的第k大的结点。 中序遍历
	int index = 0; //计数器
	public TreeNode KMaxNode(TreeNode root, int k) {
		if(root != null){
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
