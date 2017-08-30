package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N4_1_BuySellStock {

    //最多一次交易, 找到最大利润。
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int min = prices[0];
        int result = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min)
                min = prices[i];
            else
                result = Math.max(prices[i]-min, result);
        }
        return result;
    }
}
