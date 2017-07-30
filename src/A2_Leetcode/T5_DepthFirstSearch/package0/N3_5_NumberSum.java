package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N3_5_NumberSum {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int s){
        if (root == null)
            return 0;
        if (root.right == null && root.left == null)
            return s*10 + root.val;
        return helper(root.left, s*10 + root.val) + helper(root.right, s*10 + root.val);
    }
}
