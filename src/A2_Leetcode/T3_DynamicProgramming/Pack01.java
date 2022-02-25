package A2_Leetcode.T3_DynamicProgramming;

/**
 * Created by ciciya on 2017/3/20.
 */
public class Pack01 {

    //已知一个背包最多能容纳体积之和为v的物品，现有n个物品，第i个物品的体积为vi, 重量为 wi。求当前背包最多能装多大重量的物品
    public int knapsack (int V, int n, int[][] vw) {
        if(V==0 || n==0 || vw==null)
            return 0;
        int[][] dp = new int[n+1][V+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=V; j++){
                if(j < vw[i-1][0])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-vw[i-1][0]] + vw[i-1][1]);
            }
        }
        return dp[n][V];
    }
}
