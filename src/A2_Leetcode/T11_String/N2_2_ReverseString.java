package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N2_2_ReverseString {

    //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left=0, right=n-1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
