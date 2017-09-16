package A1_JianzhiOffer.T5_StackQueue;

import java.util.Stack;

/**
 * Created by ciciya on 2017/3/10.
 */
public class N5_1_QueueByTwoStacks {

    //用两个栈来实现一个队列，完成队列的Push和Pop操作
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
