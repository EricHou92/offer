package A2_Leetcode.T1_DivideAndConquer;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_3_KthSmallest {

    //给定一个n*n的矩阵，其中每一行每一列都递增排列，寻找矩阵中的第k小元素
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        while (low < high) {
            int mid = (high + low) / 2;
            if (check(matrix, mid, k, n)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean check(int[][] matrix, int mid, int k, int n) {
        int count = 0;
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                count += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return count >= k;
    }
}
