package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N16_LongestHarmoniousSub {
    public int findLHS(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (long num : nums) {
            // 数组元素计数存储
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (long num : map.keySet()) {
            if (map.containsKey(num + 1))
                result = Math.max(result, map.get(num + 1) + map.get(num));
        }
        return result;
    }
}
