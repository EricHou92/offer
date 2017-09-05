package A4_SeekJob.MeiTuan;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/11.
 */
public class N5_test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int n1 = Integer.parseInt(s1);
        String s2 = scanner.nextLine();
        String [] strings2 = s2.split(" ");
        int[] numbers = new int[strings2.length];;
        for (int i = 0; i < strings2.length; i++) {
            numbers[i] = Integer.parseInt(strings2[i]);
        }
        isExist(n1, numbers);
        System.out.println("");
    }

    public static void isExist(int n1, int[] nums1) {
        if(n1 % 2 == 0) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }

}