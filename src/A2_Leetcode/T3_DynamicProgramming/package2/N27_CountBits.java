package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N27_CountBits {

    //给定一个非负整数num。对于范围为0≤i≤num的每个数字，返回其二进制表示中的1的数量并将其作为数组。
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i=1; i<=num; i++)
            dp[i] = dp[i >> 1] + (i & 1);  // f[i] = f[i / 2] + i % 2.
        return dp;
    }
}
