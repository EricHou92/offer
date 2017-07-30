package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N9_4_SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;
        int[] result = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums) {
            if ((num & diff) == 0){ // the bit is not set
                result[0] ^= num;
            } else{ // the bit is set
                result[1] ^= num;
            }
        }
        return result;
    }
}
