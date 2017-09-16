package A1_JianzhiOffer.T1_Array;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N29_MinNumber {

    //输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
    public String PrintMinNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return "";
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            str[i] = String.valueOf(nums[i]); //转化成字符串数组
        }
        Arrays.sort(str, (s1, s2) -> {
            String c1 = s1 + s2;
            String c2 = s2 + s1;
            return c1.compareTo(c2);
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< nums.length; i++)
            sb.append(str[i]);
        return sb.toString();
    }
}
