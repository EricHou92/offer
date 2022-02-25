package A2_Leetcode.T3_DynamicProgramming.package2;

public class N40_message {

    //给你一个数组，其长度为n，在其中选出一个子序列，子序列中任意两个数不能有相邻的下标，计算不相邻子序列的最大和
    // dp[i][0]不接受预约的最大时长，dp[i][1]接受预约的最大时长
    public int massage(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        if (len == 1)
            return nums[0];
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }

}
