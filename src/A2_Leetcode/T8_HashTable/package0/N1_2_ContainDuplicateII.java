package A2_Leetcode.T8_HashTable.package0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N1_2_ContainDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if ((hashMap.containsKey(nums[i])) && (i - hashMap.get(nums[i]) <= k))
                    return true;
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
