package A1_JianzhiOffer.T4_Tree;

public class N14_HasSubtree {

	//给定彼此独立的两棵二叉树，树上的节点值两两不同，判断 t1 树是否有与 t2 树完全相同的子树。
	public boolean isContains (TreeNode root1, TreeNode root2) {
		if(root1 == null)
			return false;
		return isContains(root1.left,root2) || isContains(root1.right,root2)
				|| subTree(root1,root2);
	}

	public boolean subTree(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null || root1.val != root2.val)
			return false;
		return subTree(root1.left,root2.left) && subTree(root1.right,root2.right);
	}
}
