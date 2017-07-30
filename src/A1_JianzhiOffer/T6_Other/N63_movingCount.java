package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/3/12.
 */
public class N63_movingCount {

    public int movingCount(int threshold, int rows, int cols) {
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
        do
            sum += i%10;
        while((i = i/10) > 0);
        return sum;
    }
}
