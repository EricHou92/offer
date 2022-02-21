package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/28.
 */
public class M1_BinarySearch {

    //二分查找要求：（1）必须采用顺序存储结构 （2）必须按关键字大小有序排列
    // 二分查找递归实现
    public int binSearch(int[] nums, int low, int high, int target){
        int mid = (low + high) / 2;
        if (low <= high) {
            if (target < nums[mid]) {
                return binSearch(nums, low, mid-1, target);
            } else if (target > nums[mid]) {
                return binSearch(nums, mid+1, high, target);
            } else {
                return mid;
            }
        }
        return -1;
    }

    //二分查找普通循环实现(非递归)
    public int binSearch2(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    //请实现有重复数字的升序数组的二分查找，返回第一个出现的target下标，否则返回 -1
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                while (mid != 0 && nums[mid] == nums[mid - 1])
                    mid--;
                return mid;
            }
        }
        return -1;
    }
}
