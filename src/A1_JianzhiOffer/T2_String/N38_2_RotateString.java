package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N38_2_RotateString {

    //字符序列”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
    public String LeftRotateString(String str, int n) {
        if(str.length() == 0)
            return "";
        StringBuffer sb = new StringBuffer(str.substring(0, n));
        StringBuffer sb1 = new StringBuffer(str.substring(n, str.length()));
        sb1.append(sb);
        return sb1.toString();
    }
}
