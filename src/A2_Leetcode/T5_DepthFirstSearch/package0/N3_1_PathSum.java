package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_1_PathSum {

    //给你二叉树的根节点root 和一个表示目标和的整数targetSum 。判断该树中是否存在 根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和targetSum
    public boolean pathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum - root.val == 0) //叶子节点和为sum
            return true;
        return pathSum(root.left, sum - root.val) || pathSum(root.right, sum - root.val);
    }
}
