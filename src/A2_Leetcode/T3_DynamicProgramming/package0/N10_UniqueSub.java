package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/29.
 */
public class N10_UniqueSub {

    //分别求出以每个字符(a-z)为结束字符的最长连续字符串
    public int findSubstringInWraproundString(String p) {
        int[] nums = new int[p.length()];
        int[] count = new int[26];
        for(int i=0; i<p.length(); i++){
            nums[i] = p.charAt(i) - 'a';
        }
        int result = 0;
        int maxLen = 0;
        for( int i=0; i<p.length(); i++ ){
            if( i>0 && (nums[i-1] + 1) % 26 == nums[i]){
                maxLen ++ ;
            } else{
                maxLen = 1;
            }
            count[nums[i]] = Math.max(count[nums[i]], maxLen);
        }
        for( int i=0; i<26; i++)
            result += count[i];
        return result;
    }

}
