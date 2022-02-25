package A2_Leetcode.T10_Array;

public class N19_peakElement {

    //峰值元素是指其值严格大于左右相邻值的元素。给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，返回任何一个峰值所在位置即可。
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[mid+1])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
