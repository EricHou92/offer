package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N9_2_BuySellStockII {

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
