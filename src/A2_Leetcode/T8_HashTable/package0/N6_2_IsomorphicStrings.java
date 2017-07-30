package A2_Leetcode.T8_HashTable.package0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/15.
 */
public class N6_2_IsomorphicStrings {

    //建一个map保存映射关系, 同时用一个set保持被映射的char, 保证同一个char 不会被映射两次
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null)
            return false;
        if(s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)) {
                if(map.get(c1) != c2)
                    return false;
            }
            else {
                if(set.contains(c2))
                    return false;
                else {
                    map.put(c1, c2);
                    set.add(c2);
                }
            }
        }
        return true;
    }
}
