package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/4/12.
 */
public class N18_LargestNumber {

    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if ((strings[i] + strings[j]).compareTo(strings[j] + strings[i]) < 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] =temp;
                }
            }
        }
        if (strings[0].equals("0"))
            return "0";
        else
            return String.join("", strings);
    }
}
