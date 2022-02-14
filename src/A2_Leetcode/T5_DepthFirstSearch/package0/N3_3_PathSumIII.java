package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_3_PathSumIII {

    //给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目
    public int pathSumIII(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return helper(root, sum) + pathSumIII(root.left, sum) + pathSumIII(root.right, sum);
    }

    private int helper(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return (root.val == sum ? 1 : 0) + helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }
}
