package A2_Leetcode.T7_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by ciciya on 2017/5/8.
 */
public class N1_1_NextGreaterI {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
