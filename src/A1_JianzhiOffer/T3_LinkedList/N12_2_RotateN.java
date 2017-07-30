package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N12_2_RotateN {

    public ListNode rotateRight(ListNode head, int n) {
        if (head==null || head.next==null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        int i;
        for (i=1; fast.next!=null; i++) //Get the total length i
            fast = fast.next;
        for (int j=i-n%i; j>1; j--) //Get the i-n%i th node
            slow = slow.next;
        fast.next = head; //Do the rotation
        head = slow.next;
        slow.next = null;
        return head;
    }
}
