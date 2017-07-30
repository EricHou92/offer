package A2_Leetcode.T4_Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/8.
 */
public class N4_2_LetterCombination {

    private final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        backtrack(list, "", digits, 0);
        return list;
    }

    private void backtrack(List<String> list, String prefix, String digits, int offset) {
        if (offset >= digits.length()) {
            list.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(list, prefix + letters.charAt(i), digits, offset + 1);
        }
    }
}
