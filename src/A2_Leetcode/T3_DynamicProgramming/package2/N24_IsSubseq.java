package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N24_IsSubseq {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int indexS = 0;
        int indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length())
                    return true;
            }
            indexT++;
        }
        return false;
    }
}
