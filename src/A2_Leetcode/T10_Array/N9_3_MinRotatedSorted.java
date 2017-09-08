package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/6.
 */
public class N9_3_MinRotatedSorted {

    //假设以升序排列的数组在某个枢轴上旋转，您可以预先知道。（即，0 1 2 4 5 6 7可能变成4 5 6 7 0 1 2）。
    //找到最小元素。您可以假定阵列中不存在任何重复。
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            if (nums[low] < nums[high]) //未反转
                return nums[low];
            int mid = (low + high) / 2;
            if (nums[high] <= nums[mid]) {  //非递增, 包括最小值
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
