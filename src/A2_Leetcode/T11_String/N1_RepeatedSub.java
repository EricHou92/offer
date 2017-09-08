package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N1_RepeatedSub {

    //给定一个非空字符串，检查它是否可以通过取一个子字符串并将子串的多个副本附加在一起来构造。
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i=len/2; i>=1; i--) {
            if(len%i == 0) {
                StringBuilder sb = new StringBuilder();
                String sub = str.substring(0, i); //单元
                int m = len/i; //循环几次
                for(int j=0; j<m; j++) {
                    sb.append(sub);
                }
                if(sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}
