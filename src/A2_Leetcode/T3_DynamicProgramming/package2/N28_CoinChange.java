package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N28_CoinChange {

    //计算你需要凑够钱数的最少的硬币数量，否则返回-1。
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        int count = amount+1;
        for(int coin : coins) {
            int curr = 0;
            if (amount >= coin) {
                int next = coinChange(coins, amount-coin);
                if(next >= 0)
                    curr = next+1;
            }
            if(curr > 0)
                count = Math.min(count, curr);
        }
        int result = (count==amount+1) ? -1 : count;
        return result;
    }
}
