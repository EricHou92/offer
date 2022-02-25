package A1_JianzhiOffer.T4_Tree;

public class N15_1_Mirror {

    //请完成一个函数，输入一个二叉树，该函数输出它的镜像
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
