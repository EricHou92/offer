package A2_Leetcode.T1_DivideAndConquer;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N1_MajorityElement {

    //找到数组中的最多数元素
    public int majorityElement(int[] num) {
        int result = num[0];
        int count = 1;
        for(int i=1; i<num.length; i++){
            if(count == 0){
                count++;
                result = num[i];
            }else if(result == num[i]){
                count++;
            }else
                count--;
        }
        return result;
    }
}
