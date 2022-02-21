package A2_Leetcode.T7_Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N2_2_GenParentheses {

    //数字n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且有效的括号组合。 回溯法
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n, n, "", list);
        return list;
    }

    public void generate(int left, int right, String string, List<String> list){
        if(left > right){
            return;
        }
        if(left > 0){
            generate(left-1, right,  string + "(" , list);
        }
        if(right > 0){
            generate(left, right-1, string + ")" , list);
        }
        if(left == 0 && right == 0){
            list.add(string);
        }
    }
}
