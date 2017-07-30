package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N16_SpiralMatrix {

    //螺旋打印矩阵
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return result;
        int rowLow = 0;
        int rowHigh = matrix.length-1;
        int colLow = 0;
        int colHigh = matrix[0].length - 1;
        while (rowLow <= rowHigh && colLow <= colHigh) {
            // Traverse Right
            for (int i = colLow; i <= colHigh; i++) {
                result.add(matrix[rowLow][i]);
            }
            rowLow++;

            // Traverse Down
            for (int i = rowLow; i <= rowHigh; i++) {
                result.add(matrix[i][colHigh]);
            }
            colHigh--;

            // Traverse Left
            for (int i = colHigh; i >= colLow; i--){
                if (rowLow <= rowHigh)
                    result.add(matrix[rowHigh][i]);
            }
            rowHigh--;

            // Traver Up
            for (int i = rowHigh; i >= rowLow; i--){
                if (colLow <= colHigh)
                    result.add(matrix[i][colLow]);
            }
            colLow++;

        }
        return result;
    }
}
