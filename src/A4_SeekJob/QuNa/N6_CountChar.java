package A4_SeekJob.QuNa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/9.
 */
public class N6_CountChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine().replace(" ", "").replaceAll("\\d", "");
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, 0);
            }
            for (char c : s.toCharArray()) {
                int count = map.get(c);
                if (count == 2) {
                    System.out.println(c);
                    break;
                }
                map.put(c, count + 1);
            }
        }
    }
}
