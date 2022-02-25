package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N4_PalindromeNumber {

    //给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

}
