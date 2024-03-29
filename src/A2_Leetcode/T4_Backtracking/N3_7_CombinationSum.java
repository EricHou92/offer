package A2_Leetcode.T4_Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/7.
 */
public class N3_7_CombinationSum {

    //给定无重复集合candidates 和一个目标数target ，找出candidates中所有可以使数字和为 target 的组合。 每个数字在每个组合中只能使用多次
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0)
            return;
        else if(remain == 0)
            list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
