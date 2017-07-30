package A2_Leetcode.T2_Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N8_QueueRecon {

    public int[][] reconstructQueue(int[][] people) {
        //pick up the tallest guy first
        //when insert the next tall guy, just need to insert him into kth position
        //repeat until all people are inserted into list
        Arrays.sort(people, (p1, p2) -> p1[0]!= p2[0] ? -p1[0]+ p2[0] : p1[1]- p2[1]);
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1], cur);
        }
        return res.toArray(new int[people.length][]);
    }
}
