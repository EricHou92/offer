package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N3_3_LongestCommonSubII {

    //给定两个字符串str1和str2，输出两个字符串的最长公共子序列。如果最长公共子序列为空，则返回"-1"
    public String LCS (String s1, String s2) {
        int n1=s1.length(), n2=s2.length();
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
}
