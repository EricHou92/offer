package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N5_1_MinMoves {

    //使数组中的所有元素等于min元素
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
