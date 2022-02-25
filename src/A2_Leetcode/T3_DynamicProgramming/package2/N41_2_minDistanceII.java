package A2_Leetcode.T3_DynamicProgramming.package2;

public class N41_2_minDistanceII {

    //给定两个字符串str1和str2，再给定三个整数ic，dc和rc，分别代表插入、删除和替换一个字符的代价，请输出将str1编辑成str2的最小代价
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++)
            dp[i][0] = dp[i-1][0] + dc;
        for (int i = 1; i <= n2; i++)
            dp[0][i] = dp[0][i-1] + ic;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = Math.min(dp[i-1][j] + dc, Math.min(dp[i][j-1] + ic, dp[i-1][j-1] + rc));
            }
        }
        return dp[n1][n2];
    }

}
