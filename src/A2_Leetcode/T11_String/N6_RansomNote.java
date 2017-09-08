package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N6_RansomNote {

    //s2字母包含s1
    public boolean canConstruct(String s1, String s2) {
        int[] array = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            array[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(--array[s1.charAt(i)-'a'] < 0)
                return false;
        }
        return true;
    }
}
