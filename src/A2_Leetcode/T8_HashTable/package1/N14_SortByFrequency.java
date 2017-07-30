package A2_Leetcode.T8_HashTable.package1;

import java.util.*;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N14_SortByFrequency {

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        list.addAll(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        StringBuffer sb = new StringBuffer();
        for (Character c : list) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
