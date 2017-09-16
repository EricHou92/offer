package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N37_2_ContinuousSequence {

    //输出所有和为S的连续正数序列
    public List<List<Integer>> FindContinuousSequence(int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        if(sum <= 1)
            return lists;
        int low = 1;
        int high = 2;
        while(low <= (1+sum)/2){
            int curSum = sumOfList(low, high);
            if(curSum == sum){
                List<Integer> list = new ArrayList<>();
                for(int i=low; i<=high; i++)
                    list.add(i);
                lists.add(list);
                low++;
                high++;
            }else if(curSum < sum){
                high++;
            }else{
                low++;
            }
        }
        return lists;
    }

    public int sumOfList(int low, int high){        //计算当前序列的和
        int sum = 0;
        for(int i=low; i<= high; i++)
            sum += i;
        return sum;
    }
}
