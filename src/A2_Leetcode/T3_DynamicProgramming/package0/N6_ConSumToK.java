package A2_Leetcode.T3_DynamicProgramming.package0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/3/29.
 */
public class N6_ConSumToK {

    public boolean checkSubarraySum(int[] nums, int k) {
        //用HashMap保存sum对k取余数，如果前序有余数也为sum % k的位置，那么就存在连续子数组和为k的倍数
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //处理k为0的情况
        int runningSum = 0;
        for(int i=0; i<nums.length; i++) {
            runningSum += nums[i];
            if (k != 0)
                runningSum %= k;
            Integer prev = map.get(runningSum);
            if (prev != null) {
                if (i - prev > 1)
                    return true;
            }
            else
                map.put(runningSum, i);
        }
        return false;
    }

}
