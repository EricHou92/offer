package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N7_JumpFloor {

    //一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
    public int jumpFloor(int n) {
        if(n <= 2)
            return n;
        int result = 0;
        int one = 1;  //1级台阶， 1
        int two = 2;  //2级台阶，1+1, 2
        for(int i=3; i<=n; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
