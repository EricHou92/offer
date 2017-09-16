package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/5.
 */
public class N14_3_NextRightII {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) {
            val = x;
        }
    }

    //any binary tree
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode temp = new TreeLinkNode(0);
            TreeLinkNode cur = temp;
            while(root != null){
                if(root.left != null) {
                    cur.next = root.left;
                    cur = cur.next;
                }
                if(root.right != null) {
                    cur.next = root.right;
                    cur = cur.next;
                }
                root = root.next;
            }
            root = temp.next;
        }
    }



}
