package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N2_3_LongestParentheses {

    //基本思路就是维护一个栈，遇到左括号就进栈，遇到右括号则出栈，并且判断当前合法序列是否为最长序列。
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int start = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else{
                if (stack.isEmpty()) {
                    start = i; // // record the position before first left parenthesis
                } else{
                    stack.pop();
                    if(stack.isEmpty())
                        max = Math.max(max, i- start);
                    else
                        max = Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
}
