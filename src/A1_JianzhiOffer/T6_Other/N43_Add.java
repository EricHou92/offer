package A1_JianzhiOffer.T6_Other;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N43_Add {

    //求两个整数之和
    public int Add(int num1, int num2) {
        while(num2 != 0){
            int temp = num1 ^ num2; //异或，0+1, 1+0为1，不考虑进位
            num2 = (num1 & num2) << 1; //处理进位，只有1+1 产生进位，位与，左移
            num1 = temp;
        }
        return num1;
    }
}
