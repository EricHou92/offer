package A1_JianzhiOffer.T6_Other;

import static java.lang.Math.abs;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N9_Power {

    //1.递归版本
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n < 0){
            if (n == Integer.MIN_VALUE)   //int范围 -2^31 ~ 2^31-1
                n = Integer.MAX_VALUE - 1;
            else
                n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }


    //非递归版本
    public double myPow1(double x, int n) {
        if(n==0)
            return 1;
        if(n<0){
            if (n == Integer.MIN_VALUE)    //int范围 -2^31 ~ 2^31-1
                n = Integer.MAX_VALUE - 1;
            else
                n = -n;
            x = 1/x;
        }
        double result = 1;
        while(n>0){
            if((n&1) == 1) //奇数
                result *= x;
            x *= x;
            n >>= 1; //n除以2
        }
        return result;
    }
}
