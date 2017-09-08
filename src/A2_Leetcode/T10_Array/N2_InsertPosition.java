package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/3.
 */
public class N2_InsertPosition {

    //二分查找，给定一个排序的数组和一个目标值，如果找到目标，返回索引。 如果没有，返回顺序插入索引。无重复
    public int searchInsert(int[] nums, int key) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == key)
                return mid;
            else if(nums[mid] > key)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}
