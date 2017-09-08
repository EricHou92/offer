package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N10_SwapPairs {

    //给定一个链表，交换每两个相邻的节点并返回其头
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
