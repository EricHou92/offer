package A2_Leetcode.T8_HashTable.package0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_1_TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
