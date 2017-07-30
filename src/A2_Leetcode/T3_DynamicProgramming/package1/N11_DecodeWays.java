package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/24.
 */
public class N11_DecodeWays {

    public static void main(String[] args) {
        String s = "123";
        N11_DecodeWays arrayFind = new N11_DecodeWays();
        System.out.println(arrayFind.numDecodings(s));
    }

    public int numDecodings(String s){
        if(s.length()==0 || s==null){
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0)!='0' ?1:0;
        for(int i=2; i<=n; i++){
            int first = Integer.parseInt(s.substring(i-1, i));
            int second = Integer.parseInt(s.substring(i-2, i));
            if(first>=1 && first<=9){
                dp[i] += dp[i-1];
            }
            if(second>=10 && second<=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];  //长度为n的解码个数
    }
}
