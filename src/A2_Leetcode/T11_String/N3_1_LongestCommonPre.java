package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N3_1_LongestCommonPre {

    //编写一个函数来查找字符串数组中最长的公共前缀字符串。
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String result = strs[0];
        for(int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(result) != 0)
                result = result.substring(0, result.length()-1);
        }
        return result;
    }
}
