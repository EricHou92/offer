package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/28.
 */
public class M1_BinarySearch {

    //二分查找要求：（1）必须采用顺序存储结构 （2）必须按关键字大小有序排列
    // 二分查找递归实现
    public int binSearch(int[] nums, int low, int high, int key){
        int mid = (low + high) / 2;
        if (low <= high) {
            if (key < nums[mid]) {
                return binSearch(nums, low, mid-1, key);
            } else if (key > nums[mid]) {
                return binSearch(nums, mid+1, high, key);
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 二分查找普通循环实现(非递归)
    public int binSearch2(int[] nums, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < nums[mid]) {
                high = mid - 1;
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
