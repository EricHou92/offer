package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N25_ThanHalfNum {

    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
    public int MoreThanHalfNum_Solution(int[] nums) {
        if (nums.length == 0)
            return 0;
        int result = nums[0];
        int times = 1;
        for (int i = 1; i < nums.length; i++) {
            if (times == 0) {
                result = nums[i];
                times = 1;
            } else if (nums[i] == result)
                times++;
            else
                times--;
        }
        if(!CheckMoreThanHalf(nums, result))
            result = 0;
        return result;
    }

    private boolean CheckMoreThanHalf(int[] array, int result){
        int time = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == result)
                time++;
        }
        boolean isMoreThanHalf = true;
        if (time * 2 <= array.length)
            isMoreThanHalf = false;
        return isMoreThanHalf;
    }
}
