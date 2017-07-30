package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/5.
 */
public class N9_2_RotatedSortedII {

    //nums有重复
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return false;
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return true;
            if(nums[high] < nums[mid]){
                if (target < nums[mid] && target >= nums[low])
                    high = mid - 1;
                else
                    low = mid + 1;
            }else if(nums[high] > nums[mid]){
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }else{
                high--;  //遇到中间和边缘相等的情况,对边缘移动一步，直到边缘和中间不在相等或者相遇
            }
        }
        return nums[low] == target;
    }
}
