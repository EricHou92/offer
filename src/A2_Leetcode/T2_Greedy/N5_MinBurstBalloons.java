package A2_Leetcode.T2_Greedy;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N5_MinBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length==0)
            return 0;
        //优先按照起点位置排序，然后按照结束位置排序
        Arrays.sort(points, ( x , y) -> x[0] == y[0] ? x[1]-y[1] : x[0]-y[0]);
        int count = 1;
        int arrowLimit = points[0][1];
        //贪心法，基于上一个箭，记录当前能够射穿的所有
        for(int i=1; i<points.length; i++) {
            if(points[i][0] <= arrowLimit) {
                arrowLimit = Math.min(arrowLimit, points[i][1]);
            }
            else {
                count++;
                arrowLimit = points[i][1];
            }
        }
        return count;
    }
}
