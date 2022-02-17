package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N3_3_ReverKGroup {

    //给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null)
                return head;
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode newHead = null;
        while (head != tail) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

}
