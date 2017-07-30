package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/26.
 */
public class N10_WaterJug {

    // 4 = (-2) * 3 + 2 * 5，即3升的水罐往外倒了两次水，5升水罐往里舀了两次水。
    public boolean canMeasureWater(int x, int y, int z) {
        if(z == 0)
            return true;
        return (x + y >= z) && (z% gcd(x, y) == 0);
    }

    public int gcd(int x, int y){
        //最大公约数,辗转相除法
        while(y != 0 ){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
