package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/3/3.
 */
public class N56_1_Print {

    //给你二叉树的根节点 root ，返回其节点值的 层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root == null)
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<levelNum; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
