package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N26_IntegerBreak {

    //给定一个正整数n，将其分解为至少两个正整数的和，返回这些整数的最大乘积
    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int result = 1;
        // 因此，完美乘积的因子应为2或3。我们应该尽可能多地使用3
        while(n>4){
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;
    }
}
