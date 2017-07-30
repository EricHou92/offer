package A2_Leetcode.T8_HashTable.package0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/16.
 */
public class N7_1_Boomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<points.length; i++) {
            for(int j=0; j<points.length; j++) {
                if(i == j)
                    continue;
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
                //以每一个点为端点时，与其余点共组成多少种不同的距离，此处用map记录，key为距离长度，value为距离出现次数
            }
            for(int val : map.values()) {
                result += val * (val-1);
                //以点a为一个端点，与dis(a, b)相等的点存在n个（包含点b），那么在这n个点中任意选出两个点与点a构成三元组，
                // 则有n(n - 1) / 2种情况。但因为三元组[a, b, c]与三元组[a, c, b]并不相同，所以实际为排列问题，答案为n(n - 1)。
            }
            map.clear();
        }
        return result;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx*dx + dy*dy;
    }

}
