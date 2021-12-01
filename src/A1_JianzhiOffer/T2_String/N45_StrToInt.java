package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/27.
 */

public class N45_StrToInt {

    //将一个字符串转换成一个整数, 数值为0或者字符串不是一个合法的数值,则返回0
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
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) sum * sign;
    }
}
