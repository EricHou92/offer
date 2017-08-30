package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N3_2_HouseRobII {

    //房子围成一个圈，不抢相邻房子
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        //分别计算抢了从第二家到最后一家,  从第一家到倒数第二家的最大值，
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int low, int high) {
        int rob = 0, notRob = 0;
        for (int i = low; i <= high; i++) {
            int temp = rob;
            rob = notRob + nums[i];
            notRob = Math.max(notRob, temp);
        }
        return Math.max(rob, notRob);
    }
}
