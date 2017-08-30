package A2_Leetcode.T1_DivideAndConquer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/10.
 */
public class N2_2_TopKFrequent {

    //前K个高频元素
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
        for(int i=bucket.length-1; i>0 && k>0; --i){
            if(bucket[i]!=null){
                List<Integer> list = bucket[i];
                result.addAll(list);
                k -= list.size();
            }
        }
        return result;
    }
}
