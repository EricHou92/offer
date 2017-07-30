package A2_Leetcode.T8_HashTable.package0;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N3_LongestPalindrome {

    public int longestPalindrome(String s) {
        if(s==null || s.length()==0)
            return 0;
        Set<Character> hashSet = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hashSet.contains(s.charAt(i))){
                hashSet.remove(s.charAt(i));
                count++;
            }else{
                hashSet.add(s.charAt(i));
            }
        }
        if(!hashSet.isEmpty())
            return count*2+1;
        return count*2;
    }
}
