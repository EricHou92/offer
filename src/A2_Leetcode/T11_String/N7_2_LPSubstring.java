package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N7_2_LPSubstring {

    //给定一个字符串s，找到s中最长的回文子串
    public String longestPalindrome(String s) {
        String result = "";
        int currLength = 0;
        for(int i=0; i<s.length(); i++){
            if(isPalindrome(s, i-currLength-1, i)){
                result = s.substring(i-currLength-1, i+1); //不包括i+1
                currLength += 2;
            } else if(isPalindrome(s, i-currLength, i)){
                result = s.substring(i-currLength, i+1);
                currLength += 1;
            }
        }
        return result;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin < 0)
            return false;
        while(begin < end){
            if(s.charAt(begin++) != s.charAt(end--))
                return false;
        }
        return true;
    }

}
