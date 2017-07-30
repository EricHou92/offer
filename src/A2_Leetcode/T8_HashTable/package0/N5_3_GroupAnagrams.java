package A2_Leetcode.T8_HashTable.package0;

import java.util.*;

/**
 * Created by ciciya on 2017/5/12.
 */
public class N5_3_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars); //统一排序，之后不同次序的就变成一样
            String keyStr = String.valueOf(chars);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
