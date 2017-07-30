package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/27.
 */
public class N13_FractionAdd {

    public static void main(String[] args){
        String exp = "-1/2+1/2+1/3";
        System.out.println(new N13_FractionAdd().fractionAddition(exp));
    }

    public String fractionAddition(String expression) {
        String[] fracs = expression.split("(?=[-,+])"); // splits input string into individual fractions
        String result = "0/1";
        for (String frac : fracs)
            result = add(result, frac); // add all fractions together
        return result;
    }

    public String add(String frac1, String frac2) {
        String[] sa1 = frac1.split("/");
        String[] sa2 = frac2.split("/");
        int n1 = Integer.parseInt(sa1[0]);
        int d1 = Integer.parseInt(sa1[1]);
        int n2 = Integer.parseInt(sa2[0]);
        int d2 = Integer.parseInt(sa2[1]);
        int fenZi = n1 * d2 + n2 * d1;
        int fenMu = d1 * d2;
        String sign = "";
        if (fenZi < 0) {
            sign = "-";
            fenZi *= -1;
        }
        return sign + fenZi /gcd(fenZi, fenMu) + "/" + fenMu /gcd(fenZi, fenMu); // construct reduced fraction
    }

    // Computes gcd using Euclidean algorithm
    public int gcd(int x, int y) {
        return x == 0 || y == 0 ? x + y : gcd(y, x % y);
    }
}
