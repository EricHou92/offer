package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/26.
 */
public class N9_Sqrt {

    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x, result = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
