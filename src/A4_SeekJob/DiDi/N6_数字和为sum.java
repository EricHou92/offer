package A4_SeekJob.DiDi;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/26.
 */
public class N6_数字和为sum {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            System.out.println(bag(nums, n, sum));
        }
    }

    public static long bag(int[] weight, int n, int sum){
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j=sum; j>=weight[i]; j--){
                dp[j] = dp[j-weight[i]] + dp[j];
            }
        }
        return dp[sum];
    }

}
