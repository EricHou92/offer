package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/3/12.
 */
public class N63_movingCount {

    //地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
    // 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于threshold的格子，该机器人能够到达多少个格子
    public int movingCount(int rows, int cols, int threshold) {
        boolean used[][] = new boolean[rows][cols]; //记录是否已经走过
        return helper(0, 0, rows, cols, used, threshold);
    }

    private int helper(int i, int j, int rows, int cols, boolean[][] used, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || numSum(i) + numSum(j)  > threshold || used[i][j])
            return 0;
        used[i][j] = true;
        return helper(i - 1, j, rows, cols, used, threshold)
                + helper(i + 1, j, rows, cols, used, threshold)
                + helper(i, j - 1, rows, cols, used, threshold)
                + helper(i, j + 1, rows, cols, used, threshold)
                + 1;
    }

    private int numSum(int i) {
        int sum = 0;
        while(i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
