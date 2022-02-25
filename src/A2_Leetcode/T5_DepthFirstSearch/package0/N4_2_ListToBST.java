package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N4_2_ListToBST {

    //给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        return helper(head, null);
    }

    public TreeNode helper(ListNode left, ListNode right){
        ListNode slow = left;
        ListNode fast = left;
        if(left == right)
            return null;
        while(fast != right && fast.next != right){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(left, slow);
        root.right = helper(slow.next, right);
        return root;
    }

    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

}


