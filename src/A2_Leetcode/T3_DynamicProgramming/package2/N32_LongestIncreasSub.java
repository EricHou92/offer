package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/31.
 */
public class N32_LongestIncreasSub {

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //dp[i]代表加入第i个数能构成的最长升序序列长度
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i=0; i<nums.length; i++){
            int localMax = 0;
            // 找出当前点之前的最大上升序列长度
            for (int j=0; j<i; j++){
                if (dp[j]>localMax && nums[j]<nums[i]){
                    localMax = dp[j];
                }
            }
            // 当前点则是该局部最大上升长度加1
            dp[i] = localMax + 1;
            // 用当前点的长度更新全局最大长度
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
