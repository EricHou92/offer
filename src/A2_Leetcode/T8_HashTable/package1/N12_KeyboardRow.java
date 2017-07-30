package A2_Leetcode.T8_HashTable.package1;

import java.util.stream.Stream;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N12_KeyboardRow {

    public String[] findWords(String[] words) {
        return Stream.of(words).
                filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).
                toArray(String[]::new);
    }
}
