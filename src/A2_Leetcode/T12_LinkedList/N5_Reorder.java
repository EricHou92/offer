package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N5_Reorder {

    //给定单链表L：L0≤L1≤... Ln-1≤Ln，将其重新排序为：L0≤Ln≤L1≤Ln-1≤L2≤Ln-2≤...
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
            return;
        //Find the middle of the list
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2.next!=null && p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode mid = p1;
        ListNode cur = p1.next;
        while(cur.next!=null){
            ListNode current = cur.next;
            cur.next = current.next;
            current.next = mid.next;
            mid.next = current;
        }
        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1 = head;
        p2 = mid.next;
        while(p1 != mid){
            mid.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = mid.next;
        }
    }
}
