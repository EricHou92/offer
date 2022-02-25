package A2_Leetcode.T7_Stack;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N2_3_LongestParentheses {

    //给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
    public int longestValidParentheses(String s) {
        int result = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                else
                    result = Math.max(result, i - stack.peek());
            }
        }
        return result;
    }
}
