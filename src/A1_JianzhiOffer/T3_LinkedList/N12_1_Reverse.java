package A1_JianzhiOffer.T3_LinkedList;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N12_1_Reverse {

    //非递归
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next; //暂存原来的head.next
            head.next = newHead; //反转体现在head.next == 上一结点
            newHead = head; //头结点 == 当前结点
            head = next; //下一循环
        }
        return newHead;
    }
}
