package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N9_3_SingleNumberII {

    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
        }
        return ones;
    }
}
