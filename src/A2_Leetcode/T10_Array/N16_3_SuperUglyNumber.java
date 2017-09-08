package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/5/10.
 */
public class N16_3_SuperUglyNumber {

    //写一个程序找到第n个超级丑陋的数字。超丑号是正数，其所有素因子都在大小为k的给定素数列表中。
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        int[] index = new int[primes.length];
        nums[0] = 1;
        for (int i = 1; i < n; i++) {
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
        return nums[n - 1];
    }
}
