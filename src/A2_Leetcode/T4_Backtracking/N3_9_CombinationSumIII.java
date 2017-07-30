package A2_Leetcode.T4_Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N3_9_CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), k, n, 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int k, int n, int start) {
        if (tempList.size() == k && n == 0) {
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i = start; i <= 9; i++) {
                tempList.add(i);
                backtrack(list, tempList, k, n - i, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
