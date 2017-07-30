package A2_Leetcode.T3_DynamicProgramming.package2;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N25_UniqueDigits {

    public int countNumbersWithUniqueDigits(int n){
        if(n==0)
            return 1;
        int result = 10;
        int base = 9;
        for(int i=2; i<=n && i<=10; i++){
            base = base*(9-i+2);
            result += base;
        }
        return result;
    }
}
