package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N37_MaximalSquare {

    //在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] , dp[i-1][j-1]), dp[i-1][j]) + 1;
                    result = Math.max(dp[i][j], result);
                }
            }
        }
        return result*result;
    }
}
