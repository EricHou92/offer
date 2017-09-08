package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N8_OddEven {

    //给定一个单链表，将所有奇数节点组合在一起，然后是偶数节点
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
