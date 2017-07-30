package A5_SeekJob.Xiaohongshu;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/7/13.
 */
public class N2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            String[] strings = string.split("->");
            int[] nums = new int[strings.length-1];
            for(int i=0; i<strings.length-1; i++){
                nums[i] = Integer.parseInt(strings[i]);
            }
            int oddBegin = 0;
            int oddCount = 0;
            int[] temp = new int[nums.length];
            for(int i = 0; i< nums.length; i++){
                if((nums[i]&1) == 1)
                    oddCount++;
            }
            for(int i = 0; i< nums.length; i++){
                if((nums[i]&1) == 1)
                    temp[oddBegin++] = nums[i];
                else
                    temp[oddCount++] = nums[i];
            }
            StringBuilder result = new StringBuilder();
            for(int i = 0; i< nums.length; i++){
                result.append(temp[i] + "->");
            }
            result.append("NULL");
            System.out.print(result);
        }
    }
}
