package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N48_ArrayMultiply {

    //请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
    public int[] constructArr(int[] A) {
       /* 1.计算前i - 1个元素的乘积，及后N - i个元素的乘积分别保存在两个数组中。
           2.计算B[i]的值。*/
        int len = A.length;
        if (len == 0)
            return A;
        int[] B = new int[len];
        int[] foreword = new int[len];
        int[] backward = new int[len];
        foreword[0] = 1;
        backward[0] = 1;
        for(int i=1; i<len; i++){
            foreword[i] = A[i - 1]*foreword[i-1];
            backward[i] = A[len - i]*backward[i - 1];
        }
        for(int i=0; i<len; i++){
            B[i] = foreword[i] * backward[len-1-i];
        }
        return B;
    }
}
