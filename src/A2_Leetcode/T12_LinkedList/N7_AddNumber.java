package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/5/24.
 */
public class N7_AddNumber {

    /*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (sum / 10 == 1)
            curr.next = new ListNode(1);
        return dummy.next;
    }
}
