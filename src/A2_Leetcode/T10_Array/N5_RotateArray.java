package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N5_RotateArray {

    //给你一个数组，将数组中的元素向右轮转k个位置，其中k是非负数  [1,2,3,4,5,6,7]，3 -> [5,6,7,1,2,3,4]
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
