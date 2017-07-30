package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_JinZhi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int sum = 0;
            for(int i=2; i<a; i++){
                int temp = a;
                while(temp>0){
                    sum += temp%i;
                    temp = temp/i;
                }
            }
            int max = gongyue(sum, a-2);
            System.out.print(String.format("%d/%d\n", sum/max, (a-2)/max));
        }
    }

    //求m和n最大公约数
    private static int gongyue(int m, int n) {
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }
}
