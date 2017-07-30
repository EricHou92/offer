package A5_SeekJob.JingDong;

import java.util.Scanner;
import java.util.TreeSet;


/**
 * Created by ciciya on 2017/3/25.
 */
public class N1_JiHe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int i=0; i<n+m; i++){
                treeSet.add(scanner.nextInt());
            }
            for(int i: treeSet)
                System.out.print(i + " ");
        }
    }
}
