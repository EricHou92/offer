package A1_JianzhiOffer.T1_Array;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N27_ConSubMax {

    //连续子数组最大和
    public int maxSub(int[] nums){
        int result = nums[0];
        int end = nums[0];
        for(int i=1; i<nums.length; i++){
            end = Math.max(nums[i], nums[i]+end);
            result = Math.max(result, end);
        }
        return result;
    }
}
