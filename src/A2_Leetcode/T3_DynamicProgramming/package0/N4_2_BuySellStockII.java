package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N4_2_BuySellStockII {

    //可以多次交易, 找到最大的利润
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1] > prices[i])
                result += prices[i+1]-prices[i];
        }
        return result;
    }
}
