package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/9.
 */
public class N12_SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n == 0)
            return result;
        int rowLow = 0;
        int rowHigh = n-1;
        int colLow = 0;
        int colHigh = n-1;
        int num = 1; //change
        while (rowLow <= rowHigh && colLow <= colHigh) {
            for (int i = colLow; i <= colHigh; i ++) {
                result[rowLow][i] = num ++; //change
            }
            rowLow++;

            for (int i = rowLow; i <= rowHigh; i ++) {
                result[i][colHigh] = num ++; //change
            }
            colHigh--;

            for (int i = colHigh; i >= colLow; i --) {
                if (rowLow <= rowHigh)
                    result[rowHigh][i] = num ++; //change
            }
            rowHigh--;

            for (int i = rowHigh; i >= rowLow; i --) {
                if (colLow <= colHigh)
                    result[i][colLow] = num ++; //change
            }
            colLow++;
        }
        return result;
    }
}
