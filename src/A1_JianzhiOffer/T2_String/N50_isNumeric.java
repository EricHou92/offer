package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N50_isNumeric {

    //请实现一个函数用来判断字符串是否表示数值,字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }
}
