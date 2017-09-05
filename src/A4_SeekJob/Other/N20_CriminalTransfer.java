package A4_SeekJob.Other;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/20.
 */
public class N20_CriminalTransfer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int t= scanner.nextInt();
            int c = scanner.nextInt();
            int[] pubs = new int[n];
            for(int i=0; i<n; i++) {
                pubs[i] = scanner.nextInt();
            }
            int pubs_total = 0;
            int result = 0;
            for(int i=0; i<c; i++){
                pubs_total += pubs[i];
            }
            if(pubs_total <= t)
                result ++;
            for(int i=c; i<n; i++){
                pubs_total = pubs_total + pubs[i] - pubs[i-c];
                if(pubs_total <= t)
                    result ++;
            }
            System.out.println(result);
        }
    }
}
