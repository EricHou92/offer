package A4_SeekJob.MeiTuan;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/11.
 */
public class N4_test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            char[] strings = string.toCharArray();
            int result = 0;
            for (int i=1; i<strings.length; i++) {
                String string1 = "";
                String string2 = "";
                for (int j=0; j<strings.length; j++) {
                    if (j<i)
                        string1 += strings[j];
                    else
                        string2 += strings[j];
                }
                result = Math.max(result, getMax(string1, string2));
            }
            System.out.print(2*result);
        }
    }

    private static int getMax(String x, String y) {
        int xLen = x.length() + 1;
        int yLen = y.length() + 1;

        int rLen = xLen > yLen ? xLen : yLen;
        int cLen = xLen < yLen ? xLen : yLen;
        int[][] dp = new int[rLen][cLen];
        for (int i = 1; i < rLen; i++) {
            for (int j = 1; j < cLen; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[xLen - 1][yLen - 1];
    }

}
