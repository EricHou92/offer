package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/2/20.
 */
public class N8_NumberOfBit1 {

    //输入一个整数，输出该数二进制表示中1的个数
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }

}
