package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/12.
 */
public class N1_2_RepeatedSub {

    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i = len/2; i>=1; i--) {
            if(len %i==0) {
                int m = len /i; //循环几次
                String subS = str.substring(0,i); //单元
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}
