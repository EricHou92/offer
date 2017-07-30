package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N3_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for(int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length()-1);
        }
        return pre;
    }
}
