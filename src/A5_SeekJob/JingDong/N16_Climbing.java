package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N16_Climbing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int pd = scanner.nextInt();
            int ph = scanner.nextInt();
            int max = ph + (pd - 1);
            flag = false;
            for (int i = 1; i < M; i++) {
                int d = scanner.nextInt();
                int h = scanner.nextInt();
                if (false == flag) {
                    if (d - pd < Math.abs(h - ph)) {
                        flag = true;
                    }
                    int dleft = d - pd - Math.abs(h - ph);
                    int mymax = Math.max(h, ph) + dleft / 2;
                    if (mymax > max) {
                        max = mymax;
                    }
                    pd = d;
                    ph = h;
                }
            }
            if (flag) {
                System.out.println("IMPOSSIBLE");
            } else {
                max = Math.max(max, ph + (N - pd));
                System.out.println(max);
            }
        }
        scanner.close();
    }
}
