package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N26_IntegerBreak {

    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int product = 1;
        while(n>4){
            product*=3;
            n-=3;
        }
        product*=n;
        return product;
    }
}
