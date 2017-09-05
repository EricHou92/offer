package A4_SeekJob.MeiTuan;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/31.
 */
public class N3_拼凑金额 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int sum = scanner.nextInt();
            long[] dp = new long[sum+1];
            int[] coins = {1, 5, 10, 20, 50, 100};
            dp[0] = 1;
            for(int i=0; i<coins.length; i++){
                for(int j=0; j<dp.length; j++){
                    if(j>=coins[i])
                        dp[j] += dp[j-coins[i]];
                }
            }
            System.out.print(dp[sum]);
        }
    }
}
