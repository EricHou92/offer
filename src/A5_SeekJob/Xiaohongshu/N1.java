package A5_SeekJob.Xiaohongshu;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ciciya on 2017/7/13.
 */
public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int k = scanner.nextInt();
            char[] chars = string.toCharArray();
            for (int left = 0; left < chars.length; left += 2 * k) {
                for (int i = left, j = Math.min(left + k - 1, chars.length - 1); i<j; i++, j--) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
            String result = new String(chars);
            System.out.print(result);
        }
    }
}
