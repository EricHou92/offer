package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/6/2.
 */
public class N15_Multiply {

    public String multiply(String num1, String num2) {
        int[] pos = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--) {
            for(int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2]; //当前总和
                pos[p1] += sum / 10; //本位
                pos[p2] = (sum) % 10; //进位
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int p : pos) {
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
