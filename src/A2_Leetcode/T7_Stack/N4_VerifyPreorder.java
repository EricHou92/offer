package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N4_VerifyPreorder {

    public boolean isValidSerialization(String preorder) {
        if (preorder == null)
            return false;
        Stack<String> stack = new Stack<>();
        String[] strings = preorder.split(",");
        for (int i=0; i<strings.length; i++) {
            String curr = strings[i];
            while (curr.equals("#") && stack.peek().equals("#") && !stack.isEmpty()) {
                stack.pop();
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
            stack.push(curr);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}
