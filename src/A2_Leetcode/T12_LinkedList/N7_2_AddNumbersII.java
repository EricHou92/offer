package A2_Leetcode.T12_LinkedList;

import java.util.Stack;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N7_2_AddNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //因为要倒序，用stack
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode dummy = new ListNode(0);
        int sum = 0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
                sum += s1.pop();
            }
            if(!s2.isEmpty()){
                sum += s2.pop();
            }
            ListNode cur = new ListNode(sum %10);
            cur.next = dummy.next;
            dummy.next = cur;
            sum /= 10;
        }
        //首位有进位
        if(sum != 0){
            ListNode cur = new ListNode(1);
            cur.next = dummy.next;
            dummy.next = cur;
        }
        return dummy.next;
    }
}
