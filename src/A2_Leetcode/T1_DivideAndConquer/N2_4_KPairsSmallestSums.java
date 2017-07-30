package A2_Leetcode.T1_DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_4_KPairsSmallestSums {

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return result;
        int[] index = new int[nums1.length];
        while (k-- > 0) {
            int min_val = Integer.MAX_VALUE;
            int in = -1;
            for (int i = 0; i < nums1.length; i++) {
                if (index[i] >= nums2.length) {
                    continue;
                }
                if (nums1[i] + nums2[index[i]] < min_val) {
                    min_val = nums1[i] + nums2[index[i]];
                    in = i;
                }
            }
            if (in == -1)
                break;
            int[] temp = {nums1[in], nums2[index[in]]};
            result.add(temp);
            index[in]++;
        }
        return result;
    }
}
