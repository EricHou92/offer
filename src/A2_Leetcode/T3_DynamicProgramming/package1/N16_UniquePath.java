package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N16_UniquePath {

    //机器人位于m x n网格的左上角,只能向下或向右移动,尝试到达网格的右下角,有多少种可能的路径
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                if( i==0 || j==0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
