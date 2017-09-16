package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N11_KthNodeFromTail {

    //输入一个链表，输出该链表中倒数第k个结点
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head==null || k==0)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i=1; i<k; i++) {
            fast = fast.next;
            if (fast == null)   //链表结点数少于k
                return null;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
