package A5_SeekJob.JingDong;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N6_Election {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int a[] = new int [n];
            int p = scanner.nextInt();//小东票数
            for(int i=0;i<n-1;i++){
                a[i] = scanner.nextInt();
            }
            int len = a.length;
            Arrays.sort(a);
            int count = 0;
            while(p<=a[len-1]){
                count++;
                a[len-1]--;
                p = p+1;
                Arrays.sort(a);
            }
            System.out.println(count);
        }
    }
}
