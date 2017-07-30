package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N2_3_ReverseVowels {

    public String reverseVowels(String s) {
        if(s == null || s.length()==0)
            return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int low = 0;
        int high = s.length()-1;
        //快慢指针
        while(low < high){
            while(low < high && !vowels.contains(chars[low]+"")){
                low++;
            }
            while(low < high && !vowels.contains(chars[high]+"")){
                high--;
            }
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
        return new String(chars);
    }
}
