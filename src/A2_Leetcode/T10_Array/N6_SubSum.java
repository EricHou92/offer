package A2_Leetcode.T10_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N6_SubSum {

    //给定整数数组和整数k，您需要找到总和等于k的连续子阵列的总数。
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
