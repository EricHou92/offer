package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/5.
 */
public class N7_ArrayNesting {

    //S [K] = {A [K]，A [A [K]]，A [A [A [K]]]，...}
    // 写一个给定由N个整数组成的数组A的函数，返回该数组的最大集合S [K]的大小。
    public int arrayNesting(int[] nums) {
        int result = 0;
        for (int i = 0; i< nums.length; i++) {
            int len = 0;
            for (int k = i; nums[k] >= 0; len++) {
                int ak = nums[k];
                nums[k] = -1; // mark nums[k] as visited;
                k = ak;
            }
            result = Math.max(result, len);
        }
        return result;
    }
}
