package A2_Leetcode.T3_DynamicProgramming.package2;

public class N41_1_minDistance {

    //给你两个单词word1和word2，请返回将word1转换成word2所使用的最少操作数。你可以对一个单词进行如下三种操作：插入一个字符, 删除一个字符, 替换一个字符
    public int minDistance(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n2; i++)
            dp[0][i] = dp[0][i - 1] + 1;
        for (int i = 1; i <= n1; i++)
            dp[i][0] = dp[i - 1][0] + 1;
        //采用dp[i-1][j-1] 表示替换操作，dp[i-1][j] 表示删除操作，dp[i][j-1] 表示插入操作
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
            }
        }
        return dp[n1][n2];
    }

}
