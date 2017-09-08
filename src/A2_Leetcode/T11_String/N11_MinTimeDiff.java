package A2_Leetcode.T11_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N11_MinTimeDiff {

    //给出“小时：分钟”格式的24小时时钟点列表，找出列表中任意两个时间点之间的最小分钟差值。
    public int findMinDifference(List<String> timePoints) {
        int result = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < timePoints.size(); i++){
            Integer h = Integer.valueOf(timePoints.get(i).substring(0, 2));
            list.add(60 * h + Integer.valueOf(timePoints.get(i).substring(3, 5)));
        }
        Collections.sort(list, (Integer a, Integer b) -> a - b); //从小到大排序，保证相减为正
        for(int i = 1; i < list.size(); i++){
            result = Math.min(result, list.get(i) - list.get(i-1));
        }
        int first = list.get(0) + (24*60 - list.get(list.size()-1)); //间隔可以是23:59-00:00也可以是(24:00-23:59)+00:00
        return Math.min(result, first);
    }
}
