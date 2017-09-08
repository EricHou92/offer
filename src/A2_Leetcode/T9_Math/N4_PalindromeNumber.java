package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N4_PalindromeNumber {

    //确定一个整数是否是回文
    public boolean isPalindrome(int num) {
        int max = num;
        int min = 0;
        while(max >0){
            min = min*10 + max%10;
            max /=10;
        }
        return min==num;
    }
}
