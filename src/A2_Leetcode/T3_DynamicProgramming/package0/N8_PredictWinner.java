package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N8_PredictWinner {

    //两端循环取值，求和最大一方,保存中间状态
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length-1, new int[nums.length][nums.length]) >= 0;
    }

    public int helper(int[] nums, int low, int high, int[][] dp) {
        if(dp[low][high] == 0) {
            if(low == high)
                return nums[low];
            else
                return Math.max(nums[low]-helper(nums, low+1, high, dp), nums[high]-helper(nums, low, high-1, dp));
        }
        return dp[low][high];
    }
}
