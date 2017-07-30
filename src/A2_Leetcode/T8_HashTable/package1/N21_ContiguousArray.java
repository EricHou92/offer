package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N21_ContiguousArray {

    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int zero = 0;
        int one = 0;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            if(map.containsKey(zero-one)){
                result = Math.max(result, i-map.get(zero-one));
            }else{
                map.put(zero-one, i);
            }
        }
        return result;
    }
}
