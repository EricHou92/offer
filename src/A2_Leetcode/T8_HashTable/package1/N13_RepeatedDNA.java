package A2_Leetcode.T8_HashTable.package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N13_RepeatedDNA {

    public List<String> findRepeatedDnaSequences(String s) {
        Set set = new HashSet();
        Set result = new HashSet();
        for (int i=0; i+9<s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!set.add(ten))
                result.add(ten);
        }
        return new ArrayList(result);
    }
}
