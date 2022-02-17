package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N25_MajorityElement {

    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
    public int majorityElement(int[] nums) {
        if (nums.length == 0)
            return 0;
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count = 1;
            } else if (nums[i] == result)
                count++;
            else
                count--;
        }
        return result;
    }

}
