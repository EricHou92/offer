package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N10_reOrderArray {

    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分
    public int[] reOrderArray(int[] nums) {
        int low = 0, high = nums.length - 1, tmp;
        while(low < high) {
            while(low < high && (nums[low] & 1) == 1)
                low++;
            while(low < high && (nums[high] & 1) == 0)
                high--;
            tmp = nums[low];
            nums[low] = nums[high];
            nums[high] = tmp;
        }
        return nums;
    }
}
