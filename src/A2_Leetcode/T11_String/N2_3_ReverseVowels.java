package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/14.
 */
public class N2_3_ReverseVowels {

    //编写一个将字符串作为输入并仅反转字符串元音的函数。
    public String reverseVowels(String string) {
        if(string == null || string.length()==0)
            return string;
        String vowels = "aeiouAEIOU";
        char[] chars = string.toCharArray();
        int low = 0;
        int high = string.length()-1;
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
