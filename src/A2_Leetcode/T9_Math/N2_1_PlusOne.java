package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/23.
 */
public class N2_1_PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        //首先判断最后一位是否为9，若不是，直接加一返回，若是，则该位赋0，再继续查前一位，同样的方法，直到查完第一位。
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //如果第一位原本为9，加一后会产生新的一位。那么，查运算完的第一位是否为0，如果是，则在最前头加一个1
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
