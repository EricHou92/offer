package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/3.
 */
public class N2_InsertPosition {

    public int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}
