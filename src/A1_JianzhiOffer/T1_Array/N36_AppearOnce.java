package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N36_AppearOnce {

    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public int[] singleNumber(int[] nums) {
        //*所有所有数字相异或，则最后的结果肯定是那两个只出现一次的数字异或的结果，
        int[] result = new int[2];
        int temp = 0;
        for (int num : nums)
            temp ^= num;
        int mask = temp & (-temp);
        for (int num : nums) {
            if ((num & mask) != 0)
                result[0] ^= num;
            else
                result[1] ^= num;
        }
        return result;
    }
}
