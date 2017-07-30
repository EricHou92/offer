package A2_Leetcode.T5_DepthFirstSearch.package0;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_2_PathSumII {

    public List<List<Integer>> pathSumII(TreeNode root, int sum){
        List<Integer> list  = new LinkedList<>();
        List<List<Integer>> allList  = new LinkedList<>();
        pathSumII(root, sum, list, allList);
        return allList;
    }

    public void pathSumII(TreeNode root, int sum, List<Integer> list, List<List<Integer>> allList) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            allList.add(new LinkedList(list));
            list.remove(list.size() - 1);  //don't forget to remove the last integer
            return;
        }
        else {
            pathSumII(root.left, sum - root.val, list, allList);
            pathSumII(root.right, sum - root.val, list, allList);
        }
        list.remove(list.size() - 1);
    }
}
