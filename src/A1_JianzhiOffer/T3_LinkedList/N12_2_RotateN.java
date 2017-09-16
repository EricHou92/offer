package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N12_2_RotateN {

    //给定列表，将列表向右旋转k个位置
    //Given 1->2->3->4->5->NULL and k = 2,  return 4->5->1->2->3->NULL.
    public ListNode rotateRight(ListNode head, int n) {
        if (head==null || head.next==null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        for (int j=len-n%len; j>1; j--) //Get the len-n%len th node
            slow = slow.next;
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
