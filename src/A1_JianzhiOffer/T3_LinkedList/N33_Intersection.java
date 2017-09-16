package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N33_Intersection {

    //输入两个链表，找出它们的第一个公共结点。 O(n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.next;
            lenB--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
