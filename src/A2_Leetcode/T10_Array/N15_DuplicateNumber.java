package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N15_DuplicateNumber {

    //快慢指针，fast每次两步，slow每次一步；
    public int findDuplicate(int[] nums) {
        if (nums.length <= 1)
            return -1;
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //使用一个点，每次一步
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
