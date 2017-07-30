package A2_Leetcode.T8_HashTable.package0;

import java.util.TreeSet;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N1_3_ContainDuplicateIII {

  /*  TreeSet数据结构（Java）使用红黑树实现，是平衡二叉树的一种。
    该数据结构支持如下操作：
            1. floor()方法返set中≤给定元素的最大元素；如果不存在这样的元素，则返回 null。
            2. ceiling()方法返回set中≥给定元素的最小元素；如果不存在这样的元素，则返回 null。*/
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<1 || t<0)
            return false;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if((treeSet.floor(nums[i]) != null && nums[i] - treeSet.floor(nums[i]) <= t)
                    || (treeSet.ceiling(nums[i]) != null && treeSet.ceiling(nums[i]) - nums[i] <= t))
                return true;
            treeSet.add(nums[i]);
            if(i>=k)
                treeSet.remove(nums[i-k]);
        }
        return false;
    }
}
