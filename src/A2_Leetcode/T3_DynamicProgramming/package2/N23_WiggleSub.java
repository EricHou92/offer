package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N23_WiggleSub {

    //给定整数序列，返回正负交替摆动序列的最长子序列的长度
    public int wiggleMaxLength(int[] nums) {
        if( nums.length == 0 )
            return 0;
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        up[0] = 1;
        down[0] = 1;
        for(int i = 1 ; i < nums.length; i++){
            if( nums[i] > nums[i-1] ){
                up[i] = down[i-1]+1;
                down[i] = down[i-1];
            }else if( nums[i] < nums[i-1]){
                down[i] = up[i-1]+1;
                up[i] = up[i-1];
            }else{
                down[i] = down[i-1];
                up[i] = up[i-1];
            }
        }
        return Math.max(down[nums.length-1], up[nums.length-1]);
    }
}
