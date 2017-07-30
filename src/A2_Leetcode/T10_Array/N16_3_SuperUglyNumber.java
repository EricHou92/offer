package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/5/10.
 */
public class N16_3_SuperUglyNumber {

    public int nthSuperUglyNumber(int k, int[] primes) {
        int[] nums = new int[k];
        int[] index = new int[primes.length];
        nums[0] = 1;
        for (int i = 1; i < k; i++) {
            //find next
            nums[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++)
                nums[i] = Math.min(primes[j] * nums[index[j]], nums[i]);
            //slip duplicate
            for (int j = 0; j < primes.length; j++) {
                while (primes[j] * nums[index[j]] <= nums[i])
                    index[j]++;
            }
        }
        return nums[k - 1];
    }
}
