package A5_SeekJob.Other;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/24.
 */
public class K2_JianQiqiu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // dp[i]表示前i个气球组合的最大剪枝方法数,其实这是跟跳台阶类似的
            // 也就是说，把前面不相同的颜色的气球的剪枝数加起来就OK了！
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                int[] cnt = new int[10];
                for (int j = i - 1; j >= 0; j--) {
                    cnt[a[j]]++;
                    if (cnt[a[j]] > 1)
                        break;
                    dp[i] = (dp[i] + dp[j]) % 1000000007;
                }
            }
            System.out.println(dp[n]);
        }
        scanner.close();
    }
}
