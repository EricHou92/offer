package A2_Leetcode.T5_DepthFirstSearch.package1;

import java.util.ArrayList;
import java.util.List;

public class N20_recoverTree {

    //给你二叉搜索树的根节点root ，该树中的恰好两个节点的值被错误地交换。请在不改变其结构的情况下，恢复这棵树
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        TreeNode x = null;
        TreeNode y = null;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i).val > list.get(i+1).val) {
                y = list.get(i+1);
                if(x == null)
                    x = list.get(i);
            }
        }
        if(x!=null && y!=null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    private void dfs(TreeNode node, List<TreeNode> list) {
        if(node==null)
            return;
        dfs(node.left,list);
        list.add(node);
        dfs(node.right,list);
    }

}
