package A5_SeekJob.WangYi;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/11.
 */
public class N1_Xipai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            for(int i=0; i<t; i++){
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] nums = new int[2*n];
                for(int i1=0;i1<2*n;i++){
                    int tmp = i1 + 1;
                    for(int j = 0; j < k;j++){
                        if (tmp <= n)
                            tmp = 2*tmp - 1;
                        else
                            tmp = 2 * (tmp - n);
                    }
                    nums[tmp - 1] = scanner.nextInt();
                }
                System.out.print(nums[0]);
                for(int i1=1; i1< 2*n; i1++){
                    System.out.print(" "+nums[i1]);
                }
                System.out.println();
            }
        }
    }
}
