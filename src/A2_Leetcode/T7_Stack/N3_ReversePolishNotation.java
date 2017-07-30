package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N3_ReversePolishNotation {

    //后缀表达式
    public int evalRPN(String[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
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
                    stack.push(Integer.parseInt(a[i]));
            }
        }
        return stack.pop();
    }
}
