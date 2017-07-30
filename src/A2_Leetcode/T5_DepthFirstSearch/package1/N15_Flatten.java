package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/5.
 */
public class N15_Flatten {

    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null; //左子树全为null
        prev = root;
    }
}
