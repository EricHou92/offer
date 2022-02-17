package A2_Leetcode.T7_Stack;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N3_1_calculate {

    //给你一个字符串表达式s ，请你实现一个基本计算器来计算并返回它的值， s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
    public int calculate(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        int sign = 1;
        int sum = 0;

        int i = 0;
        int len = s.length();
        while (i < len) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = stack.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -stack.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                stack.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            } else {
                long num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                sum += sign * num;
            }
        }
        return sum;
    }
}
