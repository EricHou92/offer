package A2_Leetcode.T3_DynamicProgramming.package2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/3/31.
 */
public class N32_2_longestConsecutive {

    //给定无序数组nums，返回其中最长的连续序列的长度(要求值连续，位置可以不连续,例如 3,4,5,6为连续的自然数）
    public int MLS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int result = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if ((nums[i] - nums[i - 1]) == 1)
                count++;
            else
                count = 1;
            result = Math.max(result, count);
        }
        return result;
    }

    public int MLS2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int result = 0;
        for (int num : nums) {
            if (set.contains(num - 1))
                continue;
            int currentNum = num;
            int count = 1;
            while (set.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
