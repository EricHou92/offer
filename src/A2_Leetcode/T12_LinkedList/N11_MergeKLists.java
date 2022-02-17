package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N11_MergeKLists {

    //给你一个链表数组，每个链表都已经按升序排列。请你将所有链表合并到一个升序链表中，返回合并后的链表。
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right)
            return lists[left];
        int mid = (left + right) / 2;
        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null)
            return head2;
        else if(head2 == null)
            return head1;
        ListNode mergeHead;
        if(head1.val < head2.val){
            mergeHead = head1;
            mergeHead.next = mergeTwoLists(head1.next, head2);
        } else{
            mergeHead = head2;
            mergeHead.next = mergeTwoLists(head1, head2.next);
        }
        return mergeHead;
    }

}
