package A2_Leetcode.T5_DepthFirstSearch.package1;

public class N19_longestIncresePath {

    //给定一个 m x n 整数矩阵 matrix ，找出其中最长递增路径的长度。对于每个单元格，你可以往上，下，左，右四个方向移动
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; //当前坐标上下左右
    int rows, columns;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        rows = matrix.length;
        columns = matrix[0].length;
        int[][] memo = new int[rows][columns];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result = Math.max(result, dfs(matrix, i, j, memo));
            }
        }
        return result;
    }

    public int dfs(int[][] matrix, int row, int column, int[][] memo) {
        if (memo[row][column] != 0)
            return memo[row][column];
        memo[row][column]++;
        for (int[] dir : dirs) {
            int newRow = row + dir[0], newColumn = column + dir[1];
            if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < columns && matrix[newRow][newColumn] > matrix[row][column])
                memo[row][column] = Math.max(memo[row][column], dfs(matrix, newRow, newColumn, memo) + 1);
        }
        return memo[row][column];
    }
}
