package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N17_LongestSubNoRepeat {

    //给定一个字符串s，请你找出其中不含有重复字符的最长子串的长度
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0)
            return 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0, j=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1); //则将头指针j移动到最后找到的同一个字符的右侧
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i-j+1); //i尾指针不断向后， j头指针指向第一个不重复字符
        }
        return result;
    }
}
