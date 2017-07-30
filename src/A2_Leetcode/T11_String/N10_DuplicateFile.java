package A2_Leetcode.T11_String;

import java.util.*;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N10_DuplicateFile {

    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        if (paths.length == 0)
            return result;
        Map<String, Set<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] strings = path.split(" +"); //去除空格
            for (int i=1; i < strings.length; i++) {
                int idx = strings[i].indexOf("(");
                String content = strings[i].substring(idx);
                String filename = strings[0] + "/" + strings[i].substring(0, idx);
                Set<String> filenames = map.getOrDefault(content, new HashSet<>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {  //如果有相同内容的
                result.add(new ArrayList<>(map.get(key)));
            }
        }
        return result;
    }
}
