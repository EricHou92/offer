package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N8_PredictWinner {

    //两端循环取值，求和最大一方,保存中间状态
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length-1, new Integer[nums.length][nums.length]) >= 0;
    }

    public int helper(int[] nums, int start, int end, Integer[][] dp) {
        if(dp[start][end] == null) {
            if(start == end)
                return nums[start];
            else
                return Math.max(nums[start]-helper(nums, start+1,end, dp), nums[end]-helper(nums, start,end-1, dp));
        }
        return dp[start][end];
    }
}
