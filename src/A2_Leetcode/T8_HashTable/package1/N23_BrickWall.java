package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N23_BrickWall {

    //如果能够同时go through,说明每一层左边的和是相等的
    public int leastBricks(List<List<Integer>> wall) {
        if(wall.size() == 0)
            return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> list : wall){
            int length = 0;
            for(int i=0; i<list.size()-1; i++){
                length += list.get(i);
                map.put(length, map.getOrDefault(length, 0) + 1);
                count = Math.max(count, map.get(length)); //统计相同和的个数
            }
        }
        return wall.size() - count;
    }
}
