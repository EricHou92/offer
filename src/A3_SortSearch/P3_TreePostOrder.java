package A3_SortSearch;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/4/6.
 */
public class P3_TreePostOrder {

    //递归版本
    public void postOrderTraverse1(TreeNode root) {
        if (root != null) {
            postOrderTraverse1(root.left);
            postOrderTraverse1(root.right);
            System.out.print(root.val+"  ");
        }
    }

    public LinkedList<Integer> postOrderTraversal2(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                list.addFirst(root.val);  //头部添加
                root = root.right; //反转
            } else { //root == null && !stack.isEmpty()
                TreeNode node = stack.pop();
                root = node.left; //反转
            }
        }
        return list;
    }
}
