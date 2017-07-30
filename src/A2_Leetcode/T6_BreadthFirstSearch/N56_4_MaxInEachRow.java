package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N56_4_MaxInEachRow {

    //BFS  层序遍历的应用
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                int maxValue = Integer.MIN_VALUE;
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    maxValue = Math.max(maxValue, node.val);
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                }
                result.add(maxValue);
            }
        }
        return result;
    }
}
