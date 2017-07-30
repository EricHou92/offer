package A2_Leetcode.T3_DynamicProgramming.package3;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N38_HouseRobberII {

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] num, int low, int high) {
        int rob = 0;
        int notRob = 0;
        for (int j = low; j <= high; j++) {
            int i = rob;
            int e = notRob;
            rob = e + num[j];
            notRob = Math.max(e, i);
        }
        return Math.max(rob, notRob);
    }
}
