package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N2_1_ValidParentheses {

    /*栈最典型的应用就是验证配对情况，
    作为有效的括号，有一个右括号就必定有一个左括号在前面，
    所以我们可以将左括号都push进栈中，遇到右括号的时候再pop来消掉。*/
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
