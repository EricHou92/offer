package A1_JianzhiOffer.T4_Tree;

public class N15_1_Mirror {
	
	public void Mirror(TreeNode root){
        //递归实现
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
		if (root.left != null)
			Mirror(root.left);
		if (root.right != null)
			Mirror(root.right);
	}
}
