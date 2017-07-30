package A2_Leetcode.T3_DynamicProgramming.package3;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N37_MaximalSquare {

    public int maximalSquare(char[][] a) {
        if(a.length == 0)
            return 0;
        int m = a.length;
        int n = a[0].length;
        int result = 0;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] , dp[i-1][j-1]), dp[i-1][j]) + 1;
                    result = Math.max(dp[i][j], result); // update result
                }
            }
        }
        return result*result;
    }
}
