package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N2_2_ReverseStringII {

    //给定一个字符串和一个整数k，您需要从字符串的开头开始计算每2k个字符的第一个k个字符。
    // 如果剩下的字符少于k个字符，则反转所有字符。
    // 如果小于2k但大于或等于k个字符，则反转前k个字符并将另一个作为原始字符。
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int start = 0; start < chars.length; start += 2 * k) {
            for (int i=start, j=Math.min(start+k-1, chars.length-1);  i<j;  i++, j--) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
            }
        }
        return new String(chars);
    }
}
