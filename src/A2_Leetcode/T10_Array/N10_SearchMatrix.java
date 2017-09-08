package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N10_SearchMatrix {

    //每行的整数从左到右排序。每行的第一个整数大于上一行的最后一个整数。  判断是否有目标元素
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1)
            return false;
        int row = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = row * column - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int mid_value = matrix[mid / column][mid % column];
            if( mid_value < target){
                low = mid+1;
            }else if(mid_value > target){
                high = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
