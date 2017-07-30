package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N52_EntryCircle {

    public ListNode EntryNodeOfLoop(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        //Step 1,快慢相遇结点
        while(slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        //Step 2, 相遇之后到入口 和 头到入口 距离一样
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
