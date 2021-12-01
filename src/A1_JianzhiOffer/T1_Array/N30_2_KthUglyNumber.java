package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N30_2_KthUglyNumber {

    //把只包含因子2、3和5的数称作丑数. 习惯上我们把1当做是第一个丑数，求按从小到大的顺序的第N个丑数。
    public int kthUglyNumber(int k) {
        int[] dp = new int[k];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for(int i = 1; i < k; i++) {
            int n2 = dp[index2] * 2, n3 = dp[index3] * 3, n5 = dp[index5] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2)
                index2++;
            if(dp[i] == n3)
                index3++;
            if(dp[i] == n5)
                index5++;
        }
        return dp[k - 1];
    }
}
