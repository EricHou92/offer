package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N4_1_ArraytoBST {

    //给你一个整数数组nums ，其中元素已经按升序排列，请你将其转换为一棵高度平衡二叉搜索树
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
        return helper(num, 0, num.length-1);
    }

    private TreeNode helper(int[] num, int low, int high) {
        if (low > high)
            return null;
        int mid = (low + high) / 2; //选择中间数字作为二叉搜索树的根节点，保证平衡
        TreeNode root = new TreeNode(num[mid]);
        root.left = helper(num, low, mid-1);
        root.right = helper(num, mid+1, high);
        return root;
    }
}
