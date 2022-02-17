package A1_JianzhiOffer.T1_Array;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N27_ConSubMax {

    //输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值
    public int maxSubArray(int[] nums){
        int result = nums[0];
        int end = nums[0];
        for(int i=1; i<nums.length; i++){
            end = Math.max(nums[i], nums[i]+end);
            result = Math.max(result, end);
        }
        return result;
    }
}
