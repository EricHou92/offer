package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/7.
 */
public class N56_3_PrintBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root == null)
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                list.add(queue.poll().val);
            }
            result.add(0, list);
        }
        return result;
    }
}
