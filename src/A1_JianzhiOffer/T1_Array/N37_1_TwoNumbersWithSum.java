package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N37_1_TwoNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        //开始还在纠结乘积最小，后来转念一想，a+b=helper,a和b越远乘积越小，而一头一尾两个指针往内靠近的方法找到的就是乘积最小的情况。
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2)
            return list;
        int low = 0;
        int high = array.length-1;
        while(low < high){
            if(array[low]+array[high] == sum){
                list.add(array[low]);
                list.add(array[high]);
                return list;
            }else if(array[low]+array[high] > sum){
                high--;
            }else{
                low++;
            }
        }
        return list;
    }
}
