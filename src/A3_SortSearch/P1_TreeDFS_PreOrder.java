package A3_SortSearch;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/4/6.
 */
public class P1_TreeDFS_PreOrder {

    //先序遍历，DFS深度优先搜素， 递归版本
    public void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val+"  ");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }

    //非递归版本
    //注意，在访问过左孩子之后，需要反过来访问其右孩子，所以，需要栈这种数据结构的支持
    public void preOrderTraverse2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                System.out.print(root.val + "  ");
                stack.push(root);
                root = root.left;
            } else { //root == null && !stack.isEmpty()
                TreeNode node = stack.pop();
                root = node.right;
            }
        }
    }
}
