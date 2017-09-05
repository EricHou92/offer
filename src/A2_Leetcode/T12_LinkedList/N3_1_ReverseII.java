package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N3_1_ReverseII {

    //将链表从位置m到n反转，在原位和一次通过。
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy; //head的前一结点
        for(int i = 0; i<m-1; i++)
            pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;
        for(int i=0; i<n-m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
