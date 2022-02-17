package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N52_EntryCircle {

    //给定一个链表的头节点head ，返回链表开始入环的第一个节点。 如果链表无环，则返回null。
    public ListNode EntryNodeOfLoop(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        //Step 1,快慢相遇结点
        while(slow != fast){
            if(fast.next==null || fast.next.next==null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
