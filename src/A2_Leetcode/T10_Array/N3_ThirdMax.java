package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/3.
 */
public class N3_ThirdMax {

    //给定一个非空数组的整数，返回该数组中的第三个最大数。 如果不存在，返回最大数量。 时间复杂度O（n）
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3))
                continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
