package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N28_NumberOf1 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        for (long i = 1; i <= n; i *= 10) {
            long shi = n / i; //十位数字
            long ge = n % i; //个位数字
            // sum up the result of ones on every place k
            result += (shi + 8) / 10 * i + (shi % 10 == 1 ? ge + 1 : 0); //十位上的数字是否大于等于2
        }
        return result;
    }
}
