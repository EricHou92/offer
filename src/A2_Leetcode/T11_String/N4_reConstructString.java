package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N4_reConstructString {

    //前序遍历, 构造一个由括号和整数组成的字符串，并以预订遍历方式从二叉树中构建。
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        String result = t.val + "";
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if (left == "" && right == "")
            return result;
        if (left == "")
            return result + "()" + "(" + right + ")";
        if (right == "")
            return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
}
