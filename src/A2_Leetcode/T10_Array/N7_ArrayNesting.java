package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/5.
 */
public class N7_ArrayNesting {

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
