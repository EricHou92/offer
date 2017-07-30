package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N6_RemoveKDigits {

    /**
     * 这是一个非常简单的问题，贪心解法
     * 即 removeKdigits(num,k) = removeKdigits(removeKdigits(num,1),k-1)
     * 进行最多K轮的删除，每次从头开始寻找一位删除：
     * 1、要么第二位是0，这样相当于至少删了两位，很值得，必须这么做
     * 2、不然，找到第一个出现下降转折的位置 删除
     * */
    public String removeKdigits(String num, int k) {
        int n;
        while(true){
            n = num.length();
            if(n <= k || n == 0)
                return "0";
            if(k-- == 0)
                return num;
            if(num.charAt(1) == '0'){
                int firstNotZero = 1;
                while(firstNotZero < num.length() && num.charAt(firstNotZero) == '0')
                    firstNotZero ++;
                num = num.substring(firstNotZero);
            }
            else{
                int startIndex = 0;
                while(startIndex < num.length()-1 && num.charAt(startIndex) <= num.charAt(startIndex + 1))
                    startIndex ++;
                num = num.substring(0,startIndex)+num.substring(startIndex+1);
            }
        }
    }
}
