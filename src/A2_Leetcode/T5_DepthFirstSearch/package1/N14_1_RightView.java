package A2_Leetcode.T5_DepthFirstSearch.package1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/5.
 */
public class N14_1_RightView {

  /*  1.Each depth of the tree only select one node.
    2.View depth is current size of result list.*/
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, 0, result);
        return result;
    }

    public void rightView(TreeNode root, int depth, List<Integer> result){
        if(root == null)
            return;
        if(depth == result.size())
            result.add(root.val);
        rightView(root.right, depth + 1, result);
        rightView(root.left, depth + 1, result);
    }
}
