package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/27.
 */
public class N14_Divide {

    public int divide(int dividend, int divisor) {
        if (divisor==0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; //异或， 相同符号为1
        long dvd = Math.abs(dividend);
        long dvs = Math.abs(divisor);
        int result = 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {  //左移， 乘以2
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }
        return sign == 1 ? result : -result;
    }
}
