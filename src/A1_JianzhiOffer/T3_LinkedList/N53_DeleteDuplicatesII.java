package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N53_DeleteDuplicatesII {

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(head != null){
            while(head.next != null && head.val == head.next.val)
                head = head.next;
            if(cur.next == head)
                cur = cur.next; //不重复
            else
                cur.next = head.next; //重复，更新pre
            head = head.next;
        }
        return dummy.next;
    }
}
