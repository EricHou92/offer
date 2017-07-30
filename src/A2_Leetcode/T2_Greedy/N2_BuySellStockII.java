package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N2_BuySellStockII {
    /*
    分析：贪心法。从前向后遍历数组，只要当天的价格高于前一天的价格，就算入收益
    代码：时间O(n)，空间O(1)
    */
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1] > prices[i])
                total += prices[i+1]-prices[i];
        }
        return total;
    }
}
