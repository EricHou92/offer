package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N28_CoinChange {

    public int coinChange(int[] coins, int amount) {
        if(amount<1)
            return 0;
        int[] dp = new int[amount+1];
        int sum = 0;
        while(++sum<=amount) {
            int min = -1;
            for(int coin : coins) {
                if(sum>=coin && dp[sum-coin]!=-1) {
                    int temp = dp[sum-coin]+1;
                    min = min<0 ? temp : (temp < min ? temp : min);  //dp[i] = min(dp[i], dp[i - coins[j]] + 1);
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}
