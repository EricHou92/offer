package A2_Leetcode.T1_DivideAndConquer;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N2_1_KthLargest {

    public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }
}
