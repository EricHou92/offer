package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/3/23.
 */

public class N7_3_LPSubsequence {

    //给你一个字符串s，找出其中最长的回文子序列，并返回该序列的长度
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j <= s.length()-1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
