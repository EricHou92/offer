package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ciciya on 2017/2/22.
 */
public class N26_KthMins {

    //输入n个整数，找出其中最小的K个数。
    public int[] getLeastNumbers(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        if (k >= nums.length)
            return nums;
        return quickSort(nums, low, high, k);
    }

    private int[] quickSort(int[] nums, int low, int high, int k) {
        int start = low, end = high;
        int temp = nums[low]; //数组的第一个作为划分元素
        while(low < high){
            while(low<high && nums[high]>=temp){
                high--;
            }
            if(nums[high] < temp){
                int temp1 = nums[high];
                nums[high] = nums[low];
                nums[low] = temp1;
            }
            while(low<high && nums[low]<=temp){
                low++;
            }
            if(nums[low] > temp){
                int temp1 = nums[low];
                nums[low] = nums[high];
                nums[high] = temp1;
            }
        }
        if (low > k)
            return quickSort(nums, start, low - 1, k);
        if (low < k)
            return quickSort(nums, low + 1, end, k);
        return Arrays.copyOf(nums, k);
    }

}
