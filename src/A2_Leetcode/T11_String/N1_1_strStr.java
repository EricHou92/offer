package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N1_1_strStr {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) {
            return -1;
        } else if (len2 == 0) {
            return 0;
        }
        for (int i = 0; i <= len1 - len2; ++i) {
            if (haystack.substring(i,i+ len2).equals(needle))
                return i;
        }
        return -1;
    }
}
