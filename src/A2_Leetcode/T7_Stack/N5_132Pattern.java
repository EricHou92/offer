package A2_Leetcode.T7_Stack;

import java.util.Stack;

/**
 * Created by ciciya on 2017/5/9.
 */
public class N5_132Pattern {

    //我们维护一个栈和一个变量third，也是pattern 132中的2，栈里面按顺序放所有大于third的数字
    public boolean find132pattern(int[] nums) {
        int third = Integer.MIN_VALUE; //stack里的元素仍然都是大于third
        Stack<Integer> stack = new Stack<>();
        for( int i=nums.length-1; i>=0; i-- ){
            if( nums[i] < third) { //1出现，返回true
                return true;
            } else {
                while (!stack.empty() && nums[i] > stack.peek()) {
                    third = stack.peek();
                    stack.pop();
                }
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
