package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/12.
 */
public class N5_2_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] nums = new int[26]; //统计每个字母出现的次数
        for (int i = 0; i < s.length(); i++)
            nums[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            nums[t.charAt(i) - 'a']--;
        for (int num : nums) {
            if (num != 0)
                return false;
        }
        return true;
    }
}
