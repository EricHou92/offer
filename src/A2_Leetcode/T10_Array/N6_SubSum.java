package A2_Leetcode.T10_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N6_SubSum {

    //给你一个整数数组nums 和一个整数k ，请你统计并返回该数组中和为 k 的连续子数组的个数。
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
