package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N3_PerfectNumber {

    //我们定义Perfect Number是一个正整数，等于除了它本身的所有正除数之和。给定一个整数n,判断是否是Perfect Number
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                sum += (i + num/i);
        }
        return sum == num;
    }
}
