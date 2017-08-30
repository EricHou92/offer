package A2_Leetcode.T3_DynamicProgramming;

/**
 * Created by ciciya on 2017/3/20.
 */
public class Pack01 {

    /**
     * @param m 表示背包的最大容量
     * @param n 表示商品个数
     * @param weight 表示商品重量数组
     * @param value 表示商品价值数组
     */
    public static int[][] BackPack_Solution(int m, int n, int[] weight, int[] value) {
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i < n + 1; i++)
            dp[i][0] = 0;
        for (int j = 0; j < m + 1; j++)
            dp[0][j] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if (j >= weight[i - 1]) {
                    if ((dp[i - 1][j - weight[i - 1]] + value[i - 1]) > dp[i-1][j])
                        dp[i][j] = dp[i - 1][j - weight[i - 1]] + value[i - 1];
                    else
                        dp[i][j] = dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp;
    }
}
