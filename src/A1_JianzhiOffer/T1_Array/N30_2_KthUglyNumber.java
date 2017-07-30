package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N30_2_KthUglyNumber {

    public int KthUglyNumber(int k) {
        int[] ugly = new int[k];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i = 1; i< k; i++){
            int min = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = min;
            if(factor2 == min)
                factor2 = 2*ugly[++index2];  //先加1
            if(factor3 == min)
                factor3 = 3*ugly[++index3];
            if(factor5 == min)
                factor5 = 5*ugly[++index5];
        }
        return ugly[k -1];
    }
}
