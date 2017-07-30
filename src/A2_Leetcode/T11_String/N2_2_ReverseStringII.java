package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N2_2_ReverseStringII {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int left = 0; left < chars.length; left += 2 * k) {
            for (int i = left, j = Math.min(left + k - 1, chars.length - 1); i<j; i++, j--) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
            }
        }
        return new String(chars);
    }
}
