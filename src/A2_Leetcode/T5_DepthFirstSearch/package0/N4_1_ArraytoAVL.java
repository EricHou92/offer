package A2_Leetcode.T5_DepthFirstSearch.package0;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N4_1_ArraytoAVL {

    //给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
        return helper(num, 0, num.length-1);
    }

    private TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid-1);
        node.right = helper(num, mid+1, high);
        return node;
    }
}
