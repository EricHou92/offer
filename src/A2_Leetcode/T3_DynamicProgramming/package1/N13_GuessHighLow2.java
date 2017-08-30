package A2_Leetcode.T3_DynamicProgramming.package1;

public class N13_GuessHighLow2 {

    //从1到n，选择号码，告诉你是高还是低。你猜错了，你支付$ x。给定一个特定的n，找出你需要多少钱来保证赢
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
