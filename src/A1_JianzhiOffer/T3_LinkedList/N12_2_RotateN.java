package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N12_2_RotateN {

    //给定列表，将列表向右旋转k个位置
    //Given 1->2->3->4->5->NULL and k = 2,  return 4->5->1->2->3->NULL.
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 1;
        while (fast.next != null) {
            fast = fast.next;
            len++;
        }
        for(int i=1; i < len-k%len; i++)
            slow = slow.next;   //找到链表的第len-k个节点
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
