package A2_Leetcode.T5_DepthFirstSearch.package0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N2_TreePaths {

    public List<String> TreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null)
            searchBT(root, "", result);
        return result;
    }

    private void searchBT(TreeNode root, String path, List<String> result) {
        if (root.left == null && root.right == null)
            result.add(path + root.val);
        if (root.left != null)
            searchBT(root.left, path + root.val + "->", result);
        if (root.right != null)
            searchBT(root.right, path + root.val + "->", result);
    }
}
