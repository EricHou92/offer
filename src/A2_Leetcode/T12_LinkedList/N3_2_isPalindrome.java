package A2_Leetcode.T12_LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N3_2_isPalindrome {

    //给出一个单链表，确定它是否是回文
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int low = 0;
        int high = list.size() - 1;
        while (low < high) {
            if (!list.get(low).equals(list.get(high)))
                return false;
            low++;
            high--;
        }
        return true;
    }

}
