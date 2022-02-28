package A2_Leetcode.T5_DepthFirstSearch.package1;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N17_2_isComplete {

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
