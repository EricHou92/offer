package A1_JianzhiOffer.T4_Tree;

public class N35_1_MaxDepth {

	public int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		return (leftDepth > rightDepth) ? leftDepth+1 : rightDepth+1;
	}
}
