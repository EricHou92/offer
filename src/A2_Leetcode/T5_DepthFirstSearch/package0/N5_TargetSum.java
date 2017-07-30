package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/3/31.
 */
public class N5_TargetSum {

    int result = 0;
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0)
            return result;
        helper(nums, S, 0, 0);
        return result;
    }

    public void helper(int[] nums, int target, int pos, long eval){
        if (pos == nums.length) {
            if (target == eval)
                result++;
            return;
        }
        helper(nums, target, pos + 1, eval + nums[pos]);
        helper(nums, target, pos + 1, eval - nums[pos]);
    }
}
