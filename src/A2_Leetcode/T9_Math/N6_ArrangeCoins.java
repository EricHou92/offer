package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N6_ArrangeCoins {

    //你总共有n个硬币要形成一个楼梯形状，每个第k行必须要有k个硬币。给定n，找到可以形成的完整阶梯行的总数。
    public int arrangeCoins(int n) {
        int i;
        for (i=1; n>0; i++){
            n -= i;
        }
        if(n < 0)
            return i - 2;
        else
            return i - 1;
    }
}
