package A1_JianzhiOffer.T4_Tree;

public class N14_HasSubtree {

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if (root2 != null && root1 != null) {
			if(root1.val == root2.val)
				result = subTree(root1, root2);
			if (!result)
				result = HasSubtree(root1.left, root2);
			if (!result)
				result = HasSubtree(root1.right, root2);
		}
		return result;
	}

	private boolean subTree(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return subTree(root1.left, root2.left) && subTree(root1.right, root2.right);
	}
}
