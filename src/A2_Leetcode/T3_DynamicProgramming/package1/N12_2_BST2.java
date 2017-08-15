package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/3/26.
 */
public class N12_2_BST2 {

    public List<TreeNode> generateTrees(int n){
        return genTrees(1, n);
    }

    private List<TreeNode> genTrees(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        if(start==end){
            list.add(new TreeNode(start));
            return list;
        }
        for(int i=start; i<=end; i++){
            List<TreeNode> left = genTrees(start, i-1);
            List<TreeNode> right = genTrees(i + 1, end);
            for(TreeNode lnode: left){
                for(TreeNode rnode: right){
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x; }
    }
}


