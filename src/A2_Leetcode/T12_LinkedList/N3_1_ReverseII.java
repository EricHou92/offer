package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N3_1_ReverseII {

    //给你单链表的头指针head和两个整数left和right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回反转后的链表
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
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
