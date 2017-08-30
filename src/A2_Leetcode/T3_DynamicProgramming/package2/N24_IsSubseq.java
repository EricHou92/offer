package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N24_IsSubseq {

    //给定一个字符串s1和一个字符串s2，检查s1是否是s2的子序列，不连续
    public boolean isSubsequence(String s1, String s2) {
        if (s1.length() == 0)
            return true;
        int i = 0;
        int j = 0;
        while (i < s2.length()) {
            if (s2.charAt(i) == s1.charAt(j)) {
                j++;
                if (j == s1.length())
                    return true;
            }
            i++;
        }
        return false;
    }
}
