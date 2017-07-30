package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_1_PathSum {

    public boolean pathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum - root.val == 0) //叶子节点和为sum
            return true;
        return pathSum(root.left, sum - root.val) || pathSum(root.right, sum - root.val);
    }
}
