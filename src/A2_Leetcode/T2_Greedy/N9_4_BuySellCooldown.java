package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N9_4_BuySellCooldown {

    //出售股票后，您不能在第二天购买股票（即冷却1天）
    public int maxProfit(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
}
