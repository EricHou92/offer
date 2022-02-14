package A2_Leetcode.T5_DepthFirstSearch.package0;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N3_2_PathSumII {

    //给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点路径总和等于给定目标和的路径
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
