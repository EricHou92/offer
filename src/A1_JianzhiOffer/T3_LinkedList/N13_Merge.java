package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N13_Merge {

    //输入两个单调递增的链表，输出合成后的链表
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode mergeHead;
        if(list1.val < list2.val){
            mergeHead = list1;
            mergeHead.next = Merge(list1.next, list2);
        } else{
            mergeHead = list2;
            mergeHead.next = Merge(list1, list2.next);
        }
        return mergeHead;
    }
}
