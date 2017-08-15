package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/26.
 * 基本思路：最小化最大值算法；也就是求的是最大值，但是是最大值中的最小的那一个；
 * 那么逻辑应该是很清晰的，两步，找到最大值，再找最大值的最小值；
 基本实现：递归；——这里特别吊的是别个用了个二维数组来比较，用二维数组的序号/位置，来分析n个数的情况
 */
public class N13_GuessHighLow2 {

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        return helper(dp, 1, n);
    }

    private int helper(int[][] dp, int low, int high){
        if(low >= high)
            return 0;
        if(dp[low][high] != 0)
            return dp[low][high];
        int result = Integer.MAX_VALUE;
        for(int i=low; i<=high; i++){
            //calculate the amount to pay if pick x.
            int pay = i + Math.max(helper(dp, low, i-1), helper(dp, i+1, high));
            result = Math.min(result, pay);
        }
        dp[low][high] = result;
        return result;
    }
}
