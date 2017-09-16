package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N53_DeleteDuplicatesII {

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public  ListNode deleteDuplication(ListNode head) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(pre.next == cur){
                pre = pre.next; //不重复
            } else{
                pre.next = cur.next; //重复，更新pre
            }
            cur = cur.next; //下一步循环
        }
        return dummy.next;
    }
}
