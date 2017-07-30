package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N9_BasicCalculatorII {

    public int calculate(String s) {
        if (s == null)
            return 0;
        s = s.trim().replaceAll(" +", "");
        int result = 0;
        long preVal = 0; // initial preVal is 0
        char sign = '+'; // initial sign is +
        int i = 0;
        while (i < s.length()) {
            long curVal = 0;
            while (i < s.length() && (int)s.charAt(i) <= 57 && (int)s.charAt(i) >= 48) { // int
                curVal = curVal*10 + (s.charAt(i) - '0');
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
            if (i < s.length()) { // getting new sign
                sign = s.charAt(i);
                i++;
            }
        }
        result += preVal;
        return result;
    }
}
