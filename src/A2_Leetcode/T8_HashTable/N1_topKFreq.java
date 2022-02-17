package A2_Leetcode.T8_HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N1_topKFreq {

    //给一非空的单词列表，返回前 k 个出现次数最多的单词。 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        // 2.用 list 存储字符 key 然后自定义 Comparator 比较器对 value 进行排序。
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            } else {
                return map.get(b) - map.get(a);
            }
        });
        return list.subList(0, k);
    }

}
