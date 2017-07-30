package A2_Leetcode.T8_HashTable.package0;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N1_1_ContainDuplicate {

    public  boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if (!hashSet.add(nums[i]))
                return true;
        }
        return false;
    }
}
