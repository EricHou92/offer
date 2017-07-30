package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N48_ArrayMultiply {

    public int[] arrayMultiply(int[] A) {
       /* 分两步：
        1.计算前i - 1个元素的乘积，及后N - i个元素的乘积分别保存在两个数组中。这可以用动态规划实现。
        2.计算B[i]的值。*/
        int len = A.length;
        int[] foreword = new int[len];
        int[] backward = new int[len];
        int[] B = new int[len];
        foreword[0] = 1;
        backward[0] = 1;
        for(int i = 1;i < len; i++){
            foreword[i] = A[i - 1]*foreword[i-1];
            backward[i] = A[len - i]*backward[i - 1];
        }
        for(int i = 0; i < len; i++){
            B[i] = foreword[i] * backward[len-1-i];
        }
        return B;
    }
}
