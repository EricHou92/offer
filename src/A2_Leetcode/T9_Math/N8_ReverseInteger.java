package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/25.
 */
public class N8_ReverseInteger {

    //给定一个32位的有符号整数num，将num中的数字部分反转，最后返回反转的结果
    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = result*10 + x%10;
            x = x/10;
            if( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;
    }
}
