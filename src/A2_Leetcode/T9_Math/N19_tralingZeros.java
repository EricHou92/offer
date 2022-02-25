package A2_Leetcode.T9_Math;

public class N19_tralingZeros {

    //给定一个整数 n ，返回 n! 结果中尾随零的数量
    public long trailingZeroes (long n) {
        long count = 0;
        while(n!=0){
            count += n/5;
            n = n/5;
        }
        return count;
    }
}
