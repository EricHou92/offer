package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N1_HasCycle {

    //给定一个链表，确定它是否有环
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
