package A1_JianzhiOffer.T4_Tree;

public class N59_GetKthNode {

	//给定一颗二叉搜索树，请找出其中的第k大的结点。 中序遍历
	private int ans = 0, cnt = 0;
	public int kthLargest(TreeNode root, int k) {
		helper(root, k);
		return ans;
	}
	private void helper(TreeNode root, int k) {
		if(root == null)
			return;
		helper(root.right, k);
		if(++cnt == k)
			ans = root.val;
		helper(root.left, k);
	}
}
