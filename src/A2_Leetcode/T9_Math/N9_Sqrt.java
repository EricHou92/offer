package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/26.
 */
public class N9_Sqrt {

    //平方根， 整数
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x, result = 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    //平方根，浮点数，保留小数点后4位
    public double sqrt(double x) {
        if(x < 0)
            return Double.NaN;
        double err = 1e-4;
        double result = x;
        while (Math.abs(result-x/result) > err) //t^2接近c, 防止小数
            result = (x/result + result) / 2.0;
        return result;
    }

    //立方根， 浮点数
    public double cbrt(double x) {
        boolean b = (x > 0); //保存c的符号
        x = (x>0) ? x : -x;
        double err = 1e-15;
        double result = x;
        while(Math.abs(result*result-x/result) > err)
            result = (x/(result*result)+result)/2.0;
        result = (b) ? result : -result;
        return result;
    }
}
