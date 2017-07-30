package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N27_CountBits {

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i=1; i<=num; i++)
            dp[i] = dp[i >> 1] + (i & 1);  // f[i] = f[i / 2] + i % 2.
        return dp;
    }
}
