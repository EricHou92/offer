package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N8_ZigZag {

    public String convert(String s, int nRows) {
        if(s == null || s.length()==0 || nRows <=0)
            return "";
        if(nRows == 1)
            return s;
        StringBuilder result = new StringBuilder();
        int size = 2*nRows-2;
        for(int i=0;i<nRows;i++){
            for(int j=i;j<s.length();j+=size){
                result.append(s.charAt(j));
                if(i != 0 && i != nRows - 1){  //except the first row and the last row
                    int temp = j+size-2*i;
                    if(temp<s.length())
                        result.append(s.charAt(temp));
                }
            }
        }
        return result.toString();
    }
}
