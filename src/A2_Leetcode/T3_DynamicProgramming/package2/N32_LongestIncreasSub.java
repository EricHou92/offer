package A2_Leetcode.T3_DynamicProgramming.package2;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/3/31.
 */
public class N32_LongestIncreasSub {

    //O(nlogn) 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            int low = 0;
            int high = result;
            while (low != high) {
                int mid = (low + high) / 2;
                if (tails[mid] < num)
                    low = mid + 1;
                else
                    high = mid;
            }
            tails[low] = num;
            if (low == result)
                result++;
        }
        return result;
    }


    //O(n2)
    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0)
            return 0;
        int result = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    result = Math.max(dp[i], result);
                }
            }
        }
        return result;
    }
}
