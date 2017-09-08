package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N15_DuplicateNumber {

    //给定一个包含n + 1个整数的数组num，其中每个整数在1和n（含）之间，假设只有一个重复的数字，找到重复的一个。
    public int findDuplicate(int[] nums) {
        if (nums.length <= 1)
            return -1;
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
