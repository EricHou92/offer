package A2_Leetcode.T9_Math;

public class N20_gcd {

    //输入 a 和 b , 请返回 a 和 b 的最大公约数
    public int gcd (int a, int b) {
        if(a%b == 0)
            return b;
        else
            return gcd(b, a%b);
    }

}
