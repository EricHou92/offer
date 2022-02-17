package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N3_2_evalRPN {

    //后缀表达式 根据逆波兰表示法，求表达式的值。
    public int evalRPN(String[] strings) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int n1 = stack.pop(), n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;
                default:
                    stack.push(Integer.parseInt(strings[i]));
            }
        }
        return stack.pop();
    }
}
