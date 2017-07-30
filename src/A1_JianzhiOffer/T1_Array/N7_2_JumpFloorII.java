package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N7_2_JumpFloorII {

    //f(n) = 2^(n-1)
    public int JumpFloorII(int n) {
        if(n <= 1)
            return 1;
        else
            return 2 * JumpFloorII(n-1);
    }
}
