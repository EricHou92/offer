package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N8_NumberOfBit1 {

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
