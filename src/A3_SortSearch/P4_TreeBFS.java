package A3_SortSearch;

import java.util.LinkedList;

public class P4_TreeBFS {

    //宽度优先遍历BFS(层序遍历)
    public void BFS(TreeNode root) {
        if (root == null)
            return;
        //(顶级接口)Collection-->Queue-->Deque-->LinkedList(实现类)
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); //从队尾取出节点
            System.out.print(node.val + ",  "); //访问该节点
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }
}

