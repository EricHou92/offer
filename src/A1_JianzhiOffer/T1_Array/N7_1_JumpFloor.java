package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N7_1_JumpFloor {

    //Fibonacci, 斐波那契数列,f(n) = f(n-1) + f(n-2)
    public int JumpFloor(int n) {
        if(n <= 2)
            return n;
        int result = 0;
        int prepreNum = 1;  //1级台阶， 1
        int preNum = 2;  //2级台阶，1+1, 2
        for(int i=3; i<=n; i++){
            result = (prepreNum + preNum) % 1000000007;
            prepreNum = preNum;
            preNum = result;
        }
        return result;
    }
}
