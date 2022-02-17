package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/5.
 */
public class N9_1_RotatedSorted {

    //假设以升序排列的数组在某个枢轴上旋转，您可以预先知道。（即，0 1 2 4 5 6 7可能变成4 5 6 7 0 1 2）。
    //您将获得一个目标值进行搜索。 如果在数组中找到返回其索引，否则返回-1.   无重复
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[high] <= nums[mid]){
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else{
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
