package A2_Leetcode.T5_DepthFirstSearch.package1;

public class N21_countNodes {

    //给你一棵完全二叉树的根节点root，求出该树的节点个数
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(left == right)
            return countNodes(root.right) + (1<<left);
        else
            return countNodes(root.left) + (1<<right);
    }
    private int depth(TreeNode root){
        int level = 0;
        while(root != null){
            level++;
            root = root.left;
        }
        return level;
    }

}
