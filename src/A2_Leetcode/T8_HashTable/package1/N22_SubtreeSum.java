package A2_Leetcode.T8_HashTable.package1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N22_SubtreeSum {

    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)
            return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        List<Integer> res = new LinkedList<>();
        for(Map.Entry<Integer, Integer> me: map.entrySet()){
            if(me.getValue()==max)
                res.add(me.getKey());
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    private int helper(TreeNode root, Map<Integer, Integer> map){
        int left = (root.left==null) ? 0 : helper(root.left, map);
        int right = (root.right==null) ? 0 : helper(root.right, map);
        int sum = left + right + root.val;
        map.put(sum, map.getOrDefault(sum,0)+1);
        max = Math.max(max, map.get(sum));
        return sum;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}



