package A4_SeekJob.DiDi;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/26.
 */
public class N5_进制转换 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int radix = scanner.nextInt();
            char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            boolean negative = false;
            if (num < 0)
                negative = true;
            StringBuilder sb = new StringBuilder();
            num = Math.abs(num);
            while (num >= radix) {
                sb.insert(0, chars[num % radix]);
                num /= radix;
            }
            sb.insert(0, chars[num]);
            System.out.println((negative ? "-" :"") + sb.toString());
        }
    }

}
