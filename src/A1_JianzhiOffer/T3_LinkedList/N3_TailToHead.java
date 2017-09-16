package A1_JianzhiOffer.T3_LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/3/1.
 */
public class N3_TailToHead {

    //输入一个链表，从尾到头打印链表每个节点的值。
    public List<Integer> printList(ListNode node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            printList(node.next);
            list.add(node.val);
        }
        return list;
    }
}
