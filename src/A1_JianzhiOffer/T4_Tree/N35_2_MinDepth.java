package A1_JianzhiOffer.T4_Tree;

/**
 * Created by ciciya on 2017/5/3.
 */
public class N35_2_MinDepth {

    //最小深度
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left,right) + 1;
    }
}
