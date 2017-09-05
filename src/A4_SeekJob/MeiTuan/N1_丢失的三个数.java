package A4_SeekJob.MeiTuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/31.
 */
public class N1_丢失的三个数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] nums = new int[100001];
            for(int i=1; i<=9997; i++){
                int temp = scanner.nextInt();
                nums[temp] = temp;
            }
            List<Integer> list = new ArrayList<>();
            for(int i=1; i<10001; i++){
                if(nums[i] == 0)
                    list.add(i);
            }
            String string = "" + list.get(0) + list.get(1) + list.get(2);
            long number = Long.parseLong(string);
            System.out.println(number%7);
        }

    }
}
