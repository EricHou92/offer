package A4_SeekJob.JingDong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N5_TradeList {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            ArrayList<String> buySell = new ArrayList<>();
            ArrayList<Integer> price = new ArrayList<>();
            ArrayList<Integer> count = new ArrayList<>();
            for(int i=0; i<n; i++){
                buySell.add(scanner.next());
                price.add(scanner.nextInt());
                count.add(scanner.nextInt());
            }

        }
    }
}
