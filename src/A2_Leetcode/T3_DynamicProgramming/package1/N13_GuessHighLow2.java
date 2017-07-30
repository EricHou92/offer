package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/26.
 * 基本思路：最小化最大值算法；也就是求的是最大值，但是是最大值中的最小的那一个；
 * 那么逻辑应该是很清晰的，两步，找到最大值，再找最大值的最小值；
 基本实现：递归；——这里特别吊的是别个用了个二维数组来比较，用二维数组的序号/位置，来分析n个数的情况
 */
public class N13_GuessHighLow2 {

    public int getMoneyAmount(int n) {
        int[][] table = new int[n+1][n+1];
        return DP(table, 1, n);
    }

    private int DP(int[][] table, int start, int end){
        if(start >= end)
            return 0;
        if(table[start][end] != 0)
            return table[start][end];
        int result = Integer.MAX_VALUE;
        for(int i=start; i<=end; i++){
            //calculate the amount to pay if pick x.
            int pay = i + Math.max(DP(table, start, i-1), DP(table, i+1, end));
            result = Math.min(result, pay);
        }
        table[start][end] = result;
        return result;
    }
}
