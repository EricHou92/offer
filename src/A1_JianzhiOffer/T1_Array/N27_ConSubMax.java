package A1_JianzhiOffer.T1_Array;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N27_ConSubMax {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            int[] nums = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                nums[i] = Integer.parseInt(strings[i]);
            }
            System.out.println(maxSub(nums));
        }
    }

    //最大连续子集和
    public static int maxSub(int[] nums){
        int result = nums[0];
        int end = nums[0];
        for(int i=1; i<nums.length; i++){
            end = Math.max(nums[i], nums[i]+end);
            result = Math.max(result, end);
        }
        return result;
    }
}
