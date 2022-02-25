package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N9_3_BuySellStockIII {

    //最多两次交易, 找到最大的利润
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < prices.length; i++) {
            //不同状态下的最大利润
            buy1 = Math.max(buy1, -prices[i]); //只进行过一次买操作
            sell1 = Math.max(sell1, buy1 + prices[i]); //进行了一次买操作和一次卖操作
            buy2 = Math.max(buy2, sell1 - prices[i]); //在完成了一笔交易的前提下，进行了第二次买操作
            sell2 = Math.max(sell2, buy2 + prices[i]); //完成了全部两笔交易
        }
        return sell2;
    }

}
