package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N11_1_MatrixZeroes {

    /**
     * 给定一个矩阵，将有0的行、列全部元素置0
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {

        //使用第一行和第一列记录某行或某列是否应置为0，并再用两个状态位分别标记第一行和第一列是否也应该被置为0.
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean needFillFirstRow = false;
        boolean needFillFirstColumn = false;

        //找出含有0的行号和列号，记在该元素所在行列的第一个元素处
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        //如果某行第一个元素原本就为0，记录下这一点
                        needFillFirstRow = true;
                    }
                    if (j == 0) {
                        //如果某列第一个元素原本就为0，记录下这一点
                        needFillFirstColumn = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //按第一个元素的记录情况填充各行
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < m; i++)
                    matrix[i][j] = 0;
            }
        }

        //按第一个元素的记录情况填充各列
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++)
                    matrix[i][j] = 0;
            }
        }

        //确认是否需要填充第一行
        if (needFillFirstRow) {
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
        }

        //确认是否需要填充第一列
        if (needFillFirstColumn) {
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }
    }

}
