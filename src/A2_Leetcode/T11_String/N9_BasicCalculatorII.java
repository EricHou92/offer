package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N9_BasicCalculatorII {

    //实现基本的计算器来评估一个简单的表达式字符串, 表达式字符串仅包含非负整数，+， - ，*，/和空格。
    public int calculate(String string) {
        if (string == null)
            return 0;
        string = string.trim().replaceAll(" +", "");
        int result = 0;
        long preVal = 0; // initial preVal is 0
        char sign = '+'; // initial sign is +
        int i = 0;
        while (i < string.length()) {
            long curVal = 0;
            while (i < string.length() && (int)string.charAt(i) <= 57 && (int)string.charAt(i) >= 48) { // int
                curVal = curVal*10 + (string.charAt(i) - '0');
                i++;
            }
            if (sign == '+') {
                result += preVal;  // update result
                preVal = curVal;
            } else if (sign == '-') {
                result += preVal;  // update result
                preVal = -curVal;
            } else if (sign == '*') {
                preVal = preVal * curVal; // not update result, combine preVal & curVal and keep loop
            } else if (sign == '/') {
                preVal = preVal / curVal; // not update result, combine preVal & curVal and keep loop
            }
            if (i < string.length()) { // getting new sign
                sign = string.charAt(i);
                i++;
            }
        }
        result += preVal;
        return result;
    }
}
