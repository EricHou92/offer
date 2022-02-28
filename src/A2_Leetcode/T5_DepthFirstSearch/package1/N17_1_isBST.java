package A2_Leetcode.T5_DepthFirstSearch.package1;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N17_1_isBST {

    //给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null)
            return true;
        if (node.val <= lower || node.val >= upper)
            return false;
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}
