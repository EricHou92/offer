package A2_Leetcode.T2_Greedy;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N7_NonIntervals {

    //找到您需要删除的最小间隔数，以使剩余的间隔不重叠。
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals,(x, y) -> x.start-y.start);  // 按照起始位置进行排序
        int count = 0;
        int j = 0;
        // 如果当前位置i和上一个位置j不冲突,就顺序平移两个指针
        // 如果冲突了，那么前指针则变成当前两个指针当中覆盖最小的一个（贪心所在），后指针移动到下一个位置就好
        // 删除的方式通过控制j的取值进行
        for(int i=1; i<intervals.length; i++) {
            if(intervals[j].end > intervals[i].start){
                j = intervals[i].end < intervals[j].end ? i : j;
                count++;
            }else {
                j = i;
            }
        }
        return count;
    }

    class Interval {
        int start;
        int end;
        Interval() {start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
}
