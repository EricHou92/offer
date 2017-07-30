package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N3_4_MaxPathSum {

    int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxValue;
    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        maxValue = Math.max(maxValue, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
