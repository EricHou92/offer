package A1_JianzhiOffer.T2_String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N31_FirstAppearingOnce {

    public int FirstNotRepeatingChar(String str) {
        //哈希表存储
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (map.get(c) == 1)
                return i;
        }
        return -1;
    }
}
