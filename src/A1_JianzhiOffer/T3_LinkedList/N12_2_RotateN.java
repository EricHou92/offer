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
        ListNode tail = head;
        ListNode cur = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        for(int i=1; i < len-k%len; i++)
            cur = cur.next;   //找到链表的第len-k个节点
        tail.next = head;
        head = cur.next;
        cur.next = null;
        return head;
    }
}
