package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N37_1_TwoNumbersWithSum {

    // 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
    // a和b越远乘积越小
    public List<Integer> FindNumbersWithSum(int[] num, int sum) {
        List<Integer> list = new ArrayList<>();
        if (num == null || num.length < 2)
            return list;
        int low = 0;
        int high = num.length-1;
        while(low < high){
            if(num[low]+num[high] == sum){
                list.add(num[low]);
                list.add(num[high]);
                return list;
            }else if(num[low]+num[high] > sum){
                high--;
            }else{
                low++;
            }
        }
        return list;
    }
}
