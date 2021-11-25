package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N13_Merge {

    //输入两个单调递增的链表，输出合成后的链表
    public ListNode Merge(ListNode head1, ListNode head2) {
        if(head1 == null)
            return head2;
        else if(head2 == null)
            return head1;
        ListNode mergeHead;
        if(head1.val < head2.val){
            mergeHead = head1;
            mergeHead.next = Merge(head1.next, head2);
        } else{
            mergeHead = head2;
            mergeHead.next = Merge(head1, head2.next);
        }
        return mergeHead;
    }
}
