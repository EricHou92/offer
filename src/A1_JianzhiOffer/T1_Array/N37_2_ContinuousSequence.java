package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N37_2_ContinuousSequence {

    //输出所有和为S的连续正数序列
    public List<List<Integer>> FindContinuousSequence(int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if(target <= 1)
            return lists;
        int low = 1;
        int high = 2;
        while(low <= (1+target)/2){
            int curSum = (low+high) * (high-low+1) / 2;
            if(curSum == target){
                List<Integer> list = new ArrayList<>();
                for(int i=low; i<=high; i++)
                    list.add(i);
                lists.add(list);
                low++;
                high++;
            }else if(curSum < target){
                high++;
            }else{
                low++;
            }
        }
        return lists;
    }
}
