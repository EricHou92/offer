package A2_Leetcode.T5_DepthFirstSearch.package0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N6_IncreasingSub {

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(result, list, nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index) {
        if (list.size() > 1)
            result.add(new ArrayList<>(list));
        List<Integer> unique = new ArrayList<>();
        for (int i = index; i < nums.length; i++) {
            if (index > 0 && nums[i] < nums[index-1])
                continue; // skip non-increase
            if (unique.contains(nums[i]))
                continue; // skip duplicate
            unique.add(nums[i]);
            list.add(nums[i]);
            helper(result, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}
