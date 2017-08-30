package A2_Leetcode.T1_DivideAndConquer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N3_AddParentheses {

    //给定一个含有数字和运算符的字符串，返回所有不同的可能结果，有效的运算符是+， - 和*
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new LinkedList<>();
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '+' ) {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i+1);
                List<Integer> part1Ret = diffWaysToCompute(part1);
                List<Integer> part2Ret = diffWaysToCompute(part2);
                for (Integer p1 : part1Ret) {
                    for (Integer p2 : part2Ret) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+':
                                c = p1+p2;
                                break;
                            case '-':
                                c = p1-p2;
                                break;
                            case '*':
                                c = p1*p2;
                                break;
                        }
                        result.add(c);
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.valueOf(input));
        }
        return result;
    }

}
