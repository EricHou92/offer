package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N3_2_Palindrome {

    //O(n)时间, O(1)空间
    public boolean isPalindrome(ListNode head) {
        //(1) Move: fast pointer goes to the end, and slow goes to the middle.
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        //(2) Reverse: the right half is reversed, and slow pointer becomes the 2nd head.
        slow = reverse(slow);
        fast = head;
        //(3) Compare: run the two pointers head and slow together and compare.
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
