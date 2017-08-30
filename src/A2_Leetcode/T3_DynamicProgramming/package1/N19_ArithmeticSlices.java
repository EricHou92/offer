package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N19_ArithmeticSlices {

    //返回数组nums中的等差数列的个数
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i=2; i<nums.length; i++)
            if (nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) {
                count ++;
                sum += count;
            } else {
                count = 0;
            }
        return sum;
    }

}
