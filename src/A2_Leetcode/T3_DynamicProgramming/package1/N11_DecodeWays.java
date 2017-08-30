package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/24.
 */
public class N11_DecodeWays {

    //给定字符串，确定解码方式的总数
    public int numDecodings(String s){
        if(s.length() == 0)
            return 0;
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0)!='0' ? 1 : 0;
        for(int i=2; i<=len; i++){
            int first = Integer.parseInt(s.substring(i-1, i));
            int second = Integer.parseInt(s.substring(i-2, i));
            if(first>=1 && first<=9){
                dp[i] += dp[i-1];
            }
            if(second>=10 && second<=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[len];  //长度为n的解码个数
    }
}
