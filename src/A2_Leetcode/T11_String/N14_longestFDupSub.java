package A2_Leetcode.T11_String;

public class N14_longestFDupSub {

    //给定一个字符串，请返回其最长重复子串的长度。 若不存在任何重复字符子串，则返回0。 本题中子串的定义是字符串中一段连续的区间。
    public int longestDupSubstring (String a) {
        if (a == null || a.length() <= 1)
            return 0;
        char[] chars = a.toCharArray();
        int len = chars.length;
        int maxLen = chars.length / 2;
        for (int i = maxLen; i >= 1; --i){
            for (int j = 0; j <= len - 2 * i; ++j){
                if (check(chars, j, i))
                    return 2 * i;
            }
        }
        return 0;
    }
    public boolean check(char[] chars, int start, int len){
        for (int i = start; i < start+len; ++i){
            if (chars[i] != chars[i +len])
                return false;
        }
        return true;
    }
}
