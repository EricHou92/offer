package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/22.
 */
public class N1_RangeSum {
    int[] nums;
    public N1_RangeSum(int[] nums){
        for(int k=0; k<nums.length; k++){
            nums[k] += nums[k-1];
        }
        this.nums = nums;
    }
    public int sumRange(int i, int j){
        if(i==0)
            return nums[j];
        else
            return nums[j] - nums[i-1];
    }
}
