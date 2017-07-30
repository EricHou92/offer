package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N15_LuckyNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[100000];
        int i = 1,counter = 0;
        while (i <= 100000) {
            int k = i;
            int n10 = 0,n2 = 0;
            while (k > 0) {
                n10 += k % 10;
                k /= 10;
            }
            k = i;
            while (k > 0) {
                if((k & 1) == 1) {
                    n2++;
                }
                k >>= 1;
            }
            if(n10 == n2)
                counter++;
            result[i - 1] = counter;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(result[sc.nextInt() - 1]);
        }
    }

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt(); //第几个幸运数
            for (int i=0; i<t; i++) {
                long n = scanner.nextLong();
                int helper = 0;
                for(int j=1; j<=n; j++){
                    if(isLucky(j))
                        helper ++;
                }
                System.out.print(helper + "\n");
            }
        }
    }*/

    // 判断是否是幸运数字
    private static boolean isLucky(int n) {
        int tens=0;
        int seconds=0;
        int tmp=n;
        while(tmp!=0) {
            tens += tmp % 10;
            tmp /= 10;
        }
        tmp = n;
        while(tmp!=0) {
            seconds += tmp & 1;
            tmp >>= 1;
        }
        return tens == seconds;
    }
}
