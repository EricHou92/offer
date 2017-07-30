package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N27_MaxSub {

    //最大连续子集和
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
