package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/3/12.
 */
public class N62_hasPath {

   /* 其实回溯法也是全排列的一种方案，
   在本题中，也就是尝试了matrix矩阵中所有点作为起点的方法，
   然后依据这个点进行向四个方向的递归；
   在递归中，不满足题目的会自动出栈回到上一个状态；
   所谓的回溯无非就是对使用过的字符进行标记后和处理后的去标记*/
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        //请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
        boolean used[] = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, used))
                    return true;
            }
        }
        return false;
    }

    boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] used) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || used[index])
            return false;
        if(k == str.length - 1)
            return true;
        used[index] = true; //该字符访问过一次
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, used)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, used)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, used)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, used))
            return true;
        used[index] = false; //条件不符合，该字符还原为未访问过的标记， 回溯的本质就是标记后再去标记，以返回最初的状态。
        return false;
    }
}
