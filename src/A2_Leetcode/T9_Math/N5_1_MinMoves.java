package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N5_1_MinMoves {

    //给定大小为n的非空整数数组，找到使所有数组元素相等所需的最小移动数，移动将n-1个元素递增1。
    public int minMoves(int[] nums) {
        if (nums.length == 0)
            return 0;
        int min = nums[0];
        for (int n : nums)
            min = Math.min(min, n);
        int result = 0;
        for (int n : nums)
            result += n - min;
        return result;
    }
}
