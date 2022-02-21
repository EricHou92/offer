package A2_Leetcode.T4_Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N3_10_Combination {

    //给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合，你可以按 任何顺序 返回答案。
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), 1, n, k);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int start, int n, int k) {
        if(k == 0){
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i = start; i <= n; i++) {
                tempList.add(i);
                backtrack(list, tempList, i + 1, n, k - 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
