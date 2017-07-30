package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N3_1_HouseRob {

    public int rob(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        // dp[i][1] means we rob the current house and dp[i][0] means we don't,
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + num[i - 1];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
