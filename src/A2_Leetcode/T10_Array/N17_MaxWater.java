package A2_Leetcode.T10_Array;

public class N17_MaxWater {

    //给定n个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
    public int trap(int[] nums) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int left_max = 0;
        int right_max = 0;
        while (left < right) {
            if (nums[left] < nums[right]) {
                left_max = Math.max(nums[left], left_max);
                result += (left_max - nums[left]);
                ++left;
            } else {
                right_max = Math.max(nums[right], right_max);
                result += (right_max - nums[right]);
                --right;
            }
        }
        return result;
    }

}
