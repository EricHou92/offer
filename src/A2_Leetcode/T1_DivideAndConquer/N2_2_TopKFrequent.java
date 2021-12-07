package A2_Leetcode.T1_DivideAndConquer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/10.
 */
public class N2_2_TopKFrequent {

    //给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int n : map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null)
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }
        List<Integer> result = new LinkedList<>();
        for(int i = bucket.length - 1;i >= 0 && result.size() < k;i--){
            if(bucket[i] == null)
                continue;
            result.addAll(bucket[i]);
        }
        return result;
    }
}
