package A4_SeekJob.DiDi;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/26.
 */
public class N4_阶乘末尾0的个数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int result = 0;
            for (int i = n; i >= 5; i--) {
                int tmp = i;
                while (tmp % 5 == 0) {
                    result++;
                    tmp /= 5;
                }
            }
            System.out.println(result);
        }
    }

}
