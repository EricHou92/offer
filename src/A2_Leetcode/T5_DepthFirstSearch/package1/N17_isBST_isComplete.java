package A2_Leetcode.T5_DepthFirstSearch.package1;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N17_isBST_isComplete {

    public boolean[] judgeIt (TreeNode root) {
        boolean[] res = new boolean[2];
        res[0] = isSerachTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
        res[1] = isCompleteTree(root);
        return res;
    }

    //给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树
    public boolean isSerachTree(TreeNode root, long left, long right){
        if(root == null)
            return true;
        if(root.val <= left || root.val >= right)
            return false;
        return isSerachTree(root.left, left, root.val) && isSerachTree(root.right, root.val, right);
    }

    //给定一个二叉树的root ，确定它是否是一个完全二叉树
    public boolean isCompleteTree(TreeNode root){
        if(root == null)
            return true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false; //标记是否遇到节点不双全的节点
        while(!queue.isEmpty()){
            root = queue.poll();
            TreeNode left = root.left;
            TreeNode right = root.right;
            if((flag && !(left == null && right == null)) || (left == null && right != null))
                return false;
            if(left != null)
                queue.offer(left);
            if(right != null)
                queue.offer(right);
            if(left == null || right == null)
                flag = true;
        }
        return true;
    }
}
