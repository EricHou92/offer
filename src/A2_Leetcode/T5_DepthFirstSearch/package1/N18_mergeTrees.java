package A2_Leetcode.T5_DepthFirstSearch.package1;

public class N18_mergeTrees {

    //合并二叉树：如果两个节点重叠，那么将这两个节点的值相加作为合并后节点的新值；否则，不为 null 的节点将直接作为新二叉树的节点
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        TreeNode mergedHead = new TreeNode(t1.val + t2.val);
        mergedHead.left = mergeTrees(t1.left, t2.left);
        mergedHead.right = mergeTrees(t1.right, t2.right);
        return mergedHead;
    }
}
