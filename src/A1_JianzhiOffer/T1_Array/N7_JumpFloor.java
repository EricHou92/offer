package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N7_JumpFloor {

    //输入一个整数n，请你输出斐波那契数列的第n项, f(n) = f(n-1) + f(n-2)
    public int JumpFloor(int n) {
        if(n <= 2)
            return n;
        int result = 0;
        int one = 1;  //1级台阶， 1
        int two = 2;  //2级台阶，1+1, 2
        for(int i=3; i<=n; i++){
            result = (one + two) % 1000000007;
            one = two;
            two = result;
        }
        return result;
    }
}
