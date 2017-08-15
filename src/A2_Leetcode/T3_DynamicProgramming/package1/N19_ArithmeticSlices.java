package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N19_ArithmeticSlices {

    //等差数列的个数
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        int sum = 0;
        for (int i=2; i<A.length; i++)
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                count ++;
                sum += count;
            } else {
                count = 0;
            }
        return sum;
    }

}
