package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N47_duplicate {

    //在一个长度为n的数组里的所有数字都在0到n-1的范围内，请找出数组中任意一个重复的数字。
    public int findRepeatNumber(int[] nums) {
        //利用现有数组设置标志，当一个数字被访问过后，可以设置对应位上的数 + n，
        //之后再遇到相同的数时，会发现对应位上的数已经大于等于n了，那么直接返回这个数即可。
        int len = nums.length;
        for(int i=0; i<len; i++) {
            int index = nums[i];
            if (index >= len)
                index -= len;
            if (nums[index] >= len) {
                return index;
            }else {
                nums[index] += len;
            }
        }
        return -1;
    }
}
