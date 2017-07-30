package A2_Leetcode.T1_DivideAndConquer;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_3_KthSmallest {

    //二分查找
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length - 1][matrix[0].length - 1] + 1;  //[low, high)
        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid)
                    j--;
                count += (j + 1);
            }
            if(count < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
