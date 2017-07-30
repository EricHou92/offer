package A2_Leetcode.T7_Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ciciya on 2017/5/8.
 */
public class N1_2_NextGreaterII {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i=0; i <n*2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                result[stack.pop()] = num;
            if (i < n)
                stack.push(i);
        }
        return result;
    }
}
