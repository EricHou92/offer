package A2_Leetcode.T10_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ciciya on 2017/6/5.
 */
public class N8_2_MergeIntervals {

    //以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 
    public List<Interval> merge(List<Interval> intervals) {
        // sort start&end
        int len = intervals.size();
        int[] starts = new int[len];
        int[] ends = new int[len];
        for (int i = 0; i < len; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        // loop through
        List<Interval> result = new ArrayList<>();
        for (int i = 0, j = 0; i < len; i++) { // j is start of interval.
            if (i == len-1 || starts[i + 1] > ends[i]) {
                result.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return result;
    }

    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
  }

}
