package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N9_2_SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            result ^=nums[i];
        }
        return result;
    }
}
