package A2_Leetcode.T3_DynamicProgramming.package2;

public class N38_transNum {

    //给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
    // 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法
    public int translateNum(int num) {
        String string = String.valueOf(num);
        int len = string.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for(int i = 1; i <= len; i++){
            dp[i] = dp[i - 1];  //单独翻译s[i]
            if(i > 1){
                int t = (string.charAt(i - 2) - '0') * 10 + string.charAt(i - 1) - '0';
                if(t >= 10 && t <= 25)
                    dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }

}
