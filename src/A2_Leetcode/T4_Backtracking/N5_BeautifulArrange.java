package A2_Leetcode.T4_Backtracking;

/**
 * Created by ciciya on 2017/6/7.
 */
public class N5_BeautifulArrange {

    private int count = 0;
    public int countArrangement(int N) {
        if (N == 0)
            return 0;
        backtrack(N, 1, new int[N + 1]);
        return count;
    }

    private void backtrack(int N, int pos, int[] used) {
        if (pos > N) {
            count++;
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                backtrack(N, pos + 1, used);
                used[i] = 0;
            }
        }
    }

}
