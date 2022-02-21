package A2_Leetcode.T10_Array;

public class N18_firstMissingPositive {

    //给你一个未排序的整数数组nums ，请你找出其中没有出现的最小的正整数
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < len; ++i) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return len + 1;
    }

}
