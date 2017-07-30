package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/26.
 */
public class N12_ComplexMul {

    public String complexNumberMultiply(String a, String b) {
        String result = "";
        String[] A = a.split("\\+"); // .?*+!^$[]()\在正则里需要转义 转义需双反斜线
        String[] B = b.split("\\+");
        int a1 = Integer.parseInt(A[0]);
        int b1 = Integer.parseInt(A[1].replace("i",""));

        int a2 = Integer.parseInt(B[0]);
        int b2 = Integer.parseInt(B[1].replace("i",""));

        int a1a2 = a1 * a2;
        int b1b2 = b1 * b2;
        int fuShu = (a1 * b2) + (b1 * a2);

        String afinal = (a1a2 - b1b2) + "";
        String bfinal = fuShu + "i";
        result = afinal + "+" + bfinal;
        return result;
    }
}
