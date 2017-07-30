package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/6/2.
 */
public class N17_Rotate {

    public int maxRotateFunction(int[] A) {
        int ASum = 0;
        int F = 0;
        for (int i=0; i<A.length; i++) {
            F += i * A[i];
            ASum += A[i];
        }
        int result = F;
        for (int i=A.length-1; i>= 1; i--) {
            F = F + ASum - A.length * A[i]; //递推公式 F(k) = F(k-1) + sum - n*A[i]
            result = Math.max(F, result);
        }
        return result;
    }
}
