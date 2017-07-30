package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N2_1_ReverseSentenceII {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.trim().split(" +");
        for (int i=0; i<strings.length; i++) {
            String string1 = reverse(strings[i].toCharArray(), 0, strings[i].length() - 1);
            sb.append(string1 + " ");
        }
        return sb.toString().trim();
    }

    private String reverse(char[] ca, int i, int j) {
        while (i < j) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
            i++;
            j--;
        }
        return new String(ca);
    }
}
