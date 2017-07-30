package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N9_1_FindDifference {

    public char findTheDifference(String s, String t) {
        //利用异或的性质，相同位返回0，这样相同的字符都抵消了，剩下的就是后加的那个字符
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            c ^= t.charAt(i); //异或
        }
        return c;
    }
}
