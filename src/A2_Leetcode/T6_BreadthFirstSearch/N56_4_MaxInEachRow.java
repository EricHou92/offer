package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N56_4_MaxInEachRow {

    //给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值 BFS
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return result;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(max);
        }
        return result;
    }
}
