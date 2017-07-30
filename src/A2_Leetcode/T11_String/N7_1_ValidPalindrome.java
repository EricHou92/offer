package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N7_1_ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        int low = 0;
        int high = s.length() - 1;
        while(low <= high) {
            char cLow = s.charAt(low);
            char cHigh = s.charAt(high);
            if (!Character.isLetterOrDigit(cLow)) {
                low++;
            } else if(!Character.isLetterOrDigit(cHigh)) {
                high--;
            } else {
                if (Character.toLowerCase(cLow) != Character.toLowerCase(cHigh))
                    return false;
                low++;
                high--;
            }
        }
        return true;
    }
}
