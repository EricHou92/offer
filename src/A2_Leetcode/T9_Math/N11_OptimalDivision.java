package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/26.
 */
public class N11_OptimalDivision {

    //除了第一个除数之外，后面的数都可以转变为乘积, 1000/(100/10/2)
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        if (nums.length == 1)
            return sb.toString();
        if(nums.length == 2) {
            sb.append("/").append(nums[1]);
            return sb.toString();
        }
        sb.append("/(").append(nums[1]);
        for (int i=2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);
        }
        return sb.append(")").toString();
    }
}
