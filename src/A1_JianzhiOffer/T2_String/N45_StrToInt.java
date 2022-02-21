package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/27.
 */

public class N45_StrToInt {

    //实现把字符串转换成整数这个功能,不能使用 atoi 或者其他类似的库函数，在任何情况下，若函数不能进行有效的转换时，请返回0
    public int strToInt(String str) {
        str = str.trim();
        if (str.length() == 0)
            return 0;
        int sign = 1;
        int start = 0;
        if (str.charAt(0) == '+') {
            sign = 1;
            start++;
        } else if (str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        long sum = 0;
        for (int i = start; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9')
                break;
            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && sum > Integer.MAX_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) sum * sign;
    }
}
