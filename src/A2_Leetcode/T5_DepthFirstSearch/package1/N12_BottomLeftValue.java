package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N12_BottomLeftValue {

    int result =0, h=0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 1);
        return result;
    }

    public void findBottomLeftValue(TreeNode root, int depth) {
        if (h<depth) {
            result = root.val;
            h = depth;
        }
        if (root.left!=null)
            findBottomLeftValue(root.left, depth+1);
        if (root.right!=null)
            findBottomLeftValue(root.right, depth+1);
    }
}
