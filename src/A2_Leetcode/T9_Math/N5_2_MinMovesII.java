package A2_Leetcode.T9_Math;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N5_2_MinMovesII {

    //给定非空整数数组，找到使所有数组元素相等所需的最小移动数，移动将所选元素递增1或将所选元素递减1。
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int mid = nums[nums.length/2];
        for(int num : nums) {
            result += Math.abs(num - mid);
        }
        return result;
    }
}
