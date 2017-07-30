package A2_Leetcode.T1_DivideAndConquer;

/**
 * Created by ciciya on 2017/4/1.
 */
public class N1_MajorityElement {

    public int majorityElement(int[] num) {
        int major=num[0];
        int count = 1;
        for(int i=1; i<num.length; i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else
                count--;
        }
        return major;
    }
}
