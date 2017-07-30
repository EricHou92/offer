package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/6/6.
 */
public class N6_MinRotatedSortedII {

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
                high--;  //nums[mid]=nums[high] no idea, but we can eliminate nums[high];
            }
        }
        return nums[low];
    }
}
