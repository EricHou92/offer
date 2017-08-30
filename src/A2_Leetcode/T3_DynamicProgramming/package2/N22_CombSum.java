package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N22_CombSum {

    //只有正数且不重复的数组，返回可以组合为target的所有组合数。
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    dp[i] += dp[i - nums[j]]; //状态转移方程：dp[i]=Σdp[i-nums[j]]  0<=j<nums.length
                }
            }
        }
        return dp[target];
    }
}
