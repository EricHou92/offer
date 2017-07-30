package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/5/10.
 */
public class N16_1_isUglyNumber {

    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++) { //因子2,3,5
            while (num % i == 0)
                num /= i;
        }
        return num == 1;
    }
}
