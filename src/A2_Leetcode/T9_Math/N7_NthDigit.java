package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/25.
 */
public class N7_NthDigit {

    //找到无限整数序列1,2,3，4,5,6,7,8,9,10,11，...的第n个数字
    /*给定n = 150，首先一位有９个数字，所以位数可以＋１，这样n-9 = 141.
    然后２位的数字有２＊９０= 180，大于１４１，所以目标数字肯定是２位的．
    然后求具体落在哪个数字．可以用10+(141-1)/2 = 80求出．
    再求具体落在哪一位上，可以用(141-1)%2＝０求出为第０位，即８*/
    public int findNthDigit(int n) {
        int digits = 1;
        long first = 1;
        while (n > 9 * digits * first) {
            n -= 9 * digits * first;
            digits++;
            first *= 10;
        }
        return (first + (n-1)/digits + "").charAt((n-1)% digits) - '0';
    }

}
