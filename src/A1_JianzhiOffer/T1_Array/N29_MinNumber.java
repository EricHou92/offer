package A1_JianzhiOffer.T1_Array;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N29_MinNumber {

    public String PrintMinNumber(int[] nums) {
        /*  * 解题思路：
        * 先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。
        * 排序规则如下：
        * 若ab > ba 则 a > b，
        * 若ab < ba 则 a < b，
        * 若ab = ba 则 a = b；
        * 解释说明：
        * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
        * */
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
