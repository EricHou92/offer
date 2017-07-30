package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/5.
 */
public class N14_2_NextRight {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) {
            val = x;
        }
    }

    // perfect binary tree
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode cur = root;
            while(cur != null){ //每一层计算
                if(cur.left != null)
                    cur.left.next = cur.right; //左右相连
                if(cur.right!=null && cur.next!=null)
                    cur.right.next = cur.next.left; //两棵树相连
                cur = cur.next; //遍历该层每个节点
            }
            root = root.left; //下一层
        }
    }
}

