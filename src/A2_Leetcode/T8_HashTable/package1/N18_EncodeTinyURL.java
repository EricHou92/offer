package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N18_EncodeTinyURL {
    Map<Integer, String> map = new HashMap<>();

    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/" + longUrl.hashCode();
    }

    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}
