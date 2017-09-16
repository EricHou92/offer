package A1_JianzhiOffer.T4_Tree;

public class N15_1_Mirror {

    //给定的二叉树，将其变换为源二叉树的镜像。
	public void Mirror(TreeNode root){
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
