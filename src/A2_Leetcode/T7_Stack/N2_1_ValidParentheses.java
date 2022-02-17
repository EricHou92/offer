package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N2_1_ValidParentheses {

    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串s，判断字符串是否有效
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }
}
