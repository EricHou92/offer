package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N3_5_NumberSum {

    //给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
    //每条从根节点到叶节点的路径都代表一个数字：例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
    //计算从根节点到叶节点生成的 所有数字之和 。
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
