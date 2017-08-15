package A2_Leetcode.T3_DynamicProgramming.package0;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/3/29.
 */
public class N9_OneandZero {

    //m个1和n个0最多能完整组成字符串数组里的几个字符串。
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String s : strs) {
            int[] count = count(s);
            for (int i=m; i>=count[0]; i--) {
                for (int j = n; j >= count[1]; j--) {
                    //dp表示以当前的能用的0和1 的组合，能获得的最大情况
                    dp[i][j] = Math.max(1 + dp[i - count[0]][j - count[1]], dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }

    //统计0和1的数量
    public int[] count(String str) {
        int[] res = new int[2];
        for (int i=0;i<str.length();i++)
            res[str.charAt(i) - '0']++;
        return res;
    }
}
