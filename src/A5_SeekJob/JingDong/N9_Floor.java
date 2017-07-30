package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N9_Floor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            for(int i=0; i<num; i++){
                long n = scanner.nextInt();
                long m = scanner.nextInt();
                long a = scanner.nextInt();
                long wid = 0;
                long len = 0;
                if(n%a == 0){
                    wid = n/a;
                }
                else{
                    wid = n/a + 1;
                }
                if(m%a == 0){
                    len = m/a;
                }
                else{
                    len = m/a + 1;
                }
                long result = wid * len;
                System.out.print(result + "\n");
            }
        }
    }
}
