package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/6/2.
 */
public class N16_IntegerReplacement {

    public int integerReplacement(int n) {
        if(n==Integer.MAX_VALUE)
            return 32;
        int result = 0;
        while (n != 1) {
            if ((n & 1) == 0) {  //偶数
                n >>= 1; //右移， 除以2
            } else if (n == 3 || Integer.bitCount(n - 1) < Integer.bitCount(n + 1)) {
                n--;
            } else {
                n++;
            }
            result++;
        }
        return result;
    }
}
