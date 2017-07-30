package A2_Leetcode.T9_Math;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N5_2_MinMovesII {

    //使数组中的所有元素等于min元素
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
