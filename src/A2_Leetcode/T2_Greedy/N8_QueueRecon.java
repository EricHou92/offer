package A2_Leetcode.T2_Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N8_QueueRecon {

    // 每个人由一对整数（h，k）描述，其中h是人的高度，k是具有高度大于或等于h的这个人面前的人数。
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> p1[0]!= p2[0] ? -p1[0]+ p2[0] : p1[1]- p2[1]);
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1], cur);
        }
        return res.toArray(new int[people.length][]);
    }
}
