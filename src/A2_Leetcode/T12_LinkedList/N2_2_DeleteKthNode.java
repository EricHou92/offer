package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N2_2_DeleteKthNode {

    //给定一个链表，删除链表倒数第k个节点
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy, fast = dummy;
        slow.next = head;
        for(int i=0; i<=k; i++) {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return dummy.next;
    }
}
