package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/6/6.
 */
public class N6_MinRotatedSortedII {

    // 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    // 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[high] < nums[mid]) {
                low = mid + 1;
            }else if (nums[high] > nums[mid]) {
                high = mid;
            } else {
                high--;
            }
        }
        return nums[low];
    }
}
