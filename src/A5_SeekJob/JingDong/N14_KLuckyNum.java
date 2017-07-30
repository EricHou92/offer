package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N14_KLuckyNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt(); //第几个幸运数
            for (int i=0; i<n; i++) {
                long k = scanner.nextLong();
                StringBuilder sb = new StringBuilder();
                while (k > 0) {
                    if((k & 1) == 1) {
                        sb.append('4');
                        k = (k - 1) /2;
                    } else {
                        sb.append('7');
                        k = (k - 2)/2;
                    }
                }
                System.out.println(sb.reverse());
            }
        }
    }
}
