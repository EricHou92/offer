package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N3_4_MaxPathSum {

    //路径和是路径中各节点值的总和。给你一个二叉树的根节点root ，返回其最大路径和
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return result;
    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        result = Math.max(result, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
