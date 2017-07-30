package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/9.
 */
public class N13_RotateImage {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        new N13_RotateImage().rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                //swap(matrix[i][j], matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                //swap(matrix[i][j], matrix[i][matrix.length-1-j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

}
