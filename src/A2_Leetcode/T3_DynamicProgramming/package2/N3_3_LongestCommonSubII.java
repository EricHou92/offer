package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N3_3_LongestCommonSubII {

    //给定两个字符串str1和str2，输出两个字符串的最长公共子序列，不连续
    public String LCS (String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        String[][] dp = new String[n1+1][n2+1];
        for(int i=0; i<=n1; i++){
            for(int j=0; j<=n2; j++){
                if(i==0 || j==0)
                    dp[i][j] = "";
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
                else
                    dp[i][j] = dp[i-1][j].length()>dp[i][j-1].length() ? dp[i-1][j]:dp[i][j-1];
            }
        }
        if(dp[n1][n2] == "")
            return "-1";
        return dp[n1][n2];
    }


    //给定两个字符串str1和str2，输出两个字符串的最长公共子串，连续
    public String LCS1(String str1, String str2) {
        int maxLenth = 0;
        int maxLastIndex = 0;
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    if (dp[i + 1][j + 1] > maxLenth) {
                        maxLenth = dp[i + 1][j+1];
                        maxLastIndex = i;
                    }
                } else {
                    dp[i + 1][j+1] = 0;
                }
            }
        }
        return str1.substring(maxLastIndex - maxLenth + 1, maxLastIndex + 1);
    }
}
