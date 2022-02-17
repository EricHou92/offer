package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2022/02/15.
 */
public class N16_lowestComAncestor {

    //给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null)
            return null;
        if(left == null)
            return right;
        if(right == null)
            return left;
        return root;
    }

}
