package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N3_1_LongestCommonPre {

    //编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回""
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
