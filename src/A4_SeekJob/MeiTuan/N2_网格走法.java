package A4_SeekJob.MeiTuan;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/31.
 */
public class N2_网格走法 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] dp = new int[x+1][y+1];
            for(int i=0; i<=x; i++){
                for(int j=0; j<=y; j++){
                    if( i==0 || j==0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            System.out.print(dp[x][y]);
        }
    }
}
