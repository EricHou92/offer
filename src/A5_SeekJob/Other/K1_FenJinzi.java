package A5_SeekJob.Other;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/21.
 */
public class K1_FenJinzi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num_input = scanner.nextInt();
            for(int i=1; i<=num_input; i++){
                int number = scanner.nextInt();
                int[] nums = new int[number];
                for(int j=0; j<number; j++){
                    nums[j] = scanner.nextInt();
                }
                int[] result = PredictTheWinner(nums);
                System.out.println(String.format("Case #%d: %d %d", i, result[0], result[1]));
            }
        }
    }

    public static int[] PredictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] result = new int[2];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n-len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        result[0] = (sum+dp[0][n-1]) / 2;
        result[1] = sum - result[0];
        return result;
    }
}
