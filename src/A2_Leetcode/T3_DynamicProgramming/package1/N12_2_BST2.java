package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/3/26.
 */
public class N12_2_BST2 {

    //给定n，存储值1 到 n的所有二分搜索树
    public List<TreeNode> generateTrees(int n){
        return genTrees(1, n);
    }

    private List<TreeNode> genTrees(int low, int high) {
        List<TreeNode> list = new ArrayList<>();
        if(low > high){
            list.add(null);
            return list;
        }else if(low == high){
            list.add(new TreeNode(low));
            return list;
        }else {
            for(int i=low; i<=high; i++){
                List<TreeNode> left = genTrees(low, i-1);
                List<TreeNode> right = genTrees(i+1, high);
                for(TreeNode lnode: left){
                    for(TreeNode rnode: right){
                        TreeNode root = new TreeNode(i);
                        root.left = lnode;
                        root.right = rnode;
                        list.add(root);
                    }
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
            val = x;
        }
    }

}


