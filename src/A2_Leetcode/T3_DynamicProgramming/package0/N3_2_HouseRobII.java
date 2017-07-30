package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N3_2_HouseRobII {

    //分别计算抢了从第二家到最后一家与抢从第一家到倒数第二家的最大值，
    // 取两个值中更大的那个就是结果
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int low, int high) {
        int include = 0, exclude = 0;
        for (int j = low; j <= high; j++) {
            int i = include, e = exclude;
            include = e + nums[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }
}
