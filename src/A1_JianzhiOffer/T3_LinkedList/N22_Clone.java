package A1_JianzhiOffer.T3_LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N22_Clone {

    //方法一：递归思想,O(n2)
    public RandomListNode Clone0(RandomListNode head) {
        if (head == null)
            return null;
        RandomListNode newHead = new RandomListNode(head.val);
        newHead.random = head.random;
        newHead.next = Clone0(head.next);
        return newHead;
    }

    //方法二：复制再拆分,O(n)
    public RandomListNode Clone1(RandomListNode head){
        if(head==null)
            return null;
        RandomListNode pCur = head;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
        while(pCur!=null){
            RandomListNode node = new RandomListNode(pCur.val);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        pCur = head;
        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        while(pCur!=null){
            if(pCur.random!=null)
                pCur.next.random = pCur.random.next;
            pCur = pCur.next.next;
        }
        RandomListNode newHead = head.next;
        RandomListNode cur = newHead;
        pCur = head;
        //拆分链表
        while(pCur!=null){
            pCur.next = pCur.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;
            cur = cur.next;
            pCur = pCur.next;
        }
        return newHead;
    }

    //方法三： map, O(n)
    public RandomListNode Clone2(RandomListNode head) {
        if (head == null)
            return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        // loop 1. copy all the nodes
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.val));
            node = node.next;
        }
        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }

    class RandomListNode {
        int val;
        RandomListNode next;
        RandomListNode random;
        RandomListNode(int val) {
            this.val = val;
        }
    }
}
