package A1_JianzhiOffer.T4_Tree;

public class N35_3_IsBalanced {
    private boolean result = true;
	public boolean isBalanced(TreeNode root) {
		getDepth(root);
		return result;
	}
	
	private int getDepth(TreeNode root) {
		if(root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(Math.abs(left-right)>1)
			result = false;
		return left>right ? left+1 : right+1;
	}
}
