package A2_Leetcode.T8_HashTable.package0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/12.
 */
public class N6_1_WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map map = new HashMap();
        for (Integer i=0; i<words.length; i++) {
            //使用了HashMap对象put方法返回值的特性，比较pattern中的字母与str中的单词下标对应关系是否一致
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i))
                return false;
        }
        return true;
    }
}
