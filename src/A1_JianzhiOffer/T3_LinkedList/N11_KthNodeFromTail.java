package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N11_KthNodeFromTail {

    //查找单链表中的倒数第k个结点
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
        //让fast和slow结点整体向后移动，直到fast走到最后一个结点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
