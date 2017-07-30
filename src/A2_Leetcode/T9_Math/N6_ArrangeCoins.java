package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N6_ArrangeCoins {

    public int arrangeCoins(int n) {
        int i;
        for (i=1; n>0; i++){
            n -= i;
        }
        if(n < 0)
            return i - 2;
        else
            return i - 1;
    }
}
