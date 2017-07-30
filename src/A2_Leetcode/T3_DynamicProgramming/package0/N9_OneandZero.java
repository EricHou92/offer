package A2_Leetcode.T3_DynamicProgramming.package0;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/3/29.
 */
public class N9_OneandZero {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length+1][m+1][n+1];
        for (int i = 0; i < strs.length+1; i++) {
            int[] nums = {0,0};
            if (i > 0) {
                nums = calculate(strs[i-1]);
            }
            for (int j = 0; j < m+1; j++) {
                for (int k = 0; k < n+1; k++) {
                    if (i == 0) {
                        dp[i][j][k] = 0;
                    } else if (j>=nums[0] && k>=nums[1]) {
                        dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j-nums[0]][k-nums[1]]+1);
                    } else {
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }

    //计算每个字符串0和1的个数
    private int[] calculate(String str) {
        int[] res = new int[2];
        Arrays.fill(res, 0);
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                res[0]++;
            } else if (ch == '1') {
                res[1]++;
            }
        }
        return res;
    }
}
