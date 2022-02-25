package A2_Leetcode.T4_Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/7.
 */
public class N3_1_Subsets {

    //给你一个整数数组nums，数组中的元素互不相同，返回该数组所有可能的子集
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int[] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
