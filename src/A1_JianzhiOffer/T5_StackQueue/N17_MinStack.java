package A1_JianzhiOffer.T5_StackQueue;

import java.util.Stack;

/**
 * Created by ciciya on 2017/3/10.
 */
public class N17_MinStack {

    //定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int x) {
        stackData.push(x);
        if (stackMin.isEmpty() || x <= stackMin.peek())
            stackMin.push(x);
    }

    public void pop() {
        int num = stackData.pop();
        int num2 = stackMin.pop();
        if(num != num2)
            stackMin.push(num2);
    }

    public int top() {
        return stackData.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }

}
