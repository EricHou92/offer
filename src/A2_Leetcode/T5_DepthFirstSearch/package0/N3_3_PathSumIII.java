package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_3_PathSumIII {

    //The path does not need to start or end at the root or a leaf, but it must go downwards
    public int pathSumIII(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return helper(root, sum) + pathSumIII(root.left, sum) + pathSumIII(root.right, sum);
    }

    private int helper(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return (root.val == sum ? 1 : 0)
                + helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }
}
