package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/9.
 */
public class N13_RotateImage {

    //给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度. 对角线翻转+水平翻转
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

}
