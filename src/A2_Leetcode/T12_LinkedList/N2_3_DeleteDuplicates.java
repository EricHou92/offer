package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N2_3_DeleteDuplicates {

    //给定一个排序的链表，删除所有的重复项，使每个元素只显示一次
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
