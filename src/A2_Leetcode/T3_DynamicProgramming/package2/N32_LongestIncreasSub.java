package A2_Leetcode.T3_DynamicProgramming.package2;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/3/31.
 */
public class N32_LongestIncreasSub {

    //给定一个未排序的整数数组，返回最长递增子序列的长度
    // O(nlogn),end是不断增大的数组
    public int lengthOfLIS(int[] nums) {
        int[] end = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            int low = 0;
            int high = result;
            while (low != high) {
                int mid = (low + high) / 2;
                if (end[mid] < num)
                    low = mid + 1;
                else
                    high = mid;
            }
            end[low] = num;
            if (low == result)
                result++;
        }
        return result;
    }


    //O(n2)
    public int getLIS2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int result = 1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
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
