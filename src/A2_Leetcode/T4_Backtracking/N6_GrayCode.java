package A2_Leetcode.T4_Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N6_GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1<<n; i++)
            result.add(i ^ i>>1);
        return result;
    }
}
