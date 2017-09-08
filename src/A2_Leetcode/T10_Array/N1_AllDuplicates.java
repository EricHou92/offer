package A2_Leetcode.T10_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N1_AllDuplicates {

    //给定整数数组，1≤a[i]≤n（n=数组大小），有些元素出现两次，其他元素出现一次,找到在这个数组中出现两次的所有元素。
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                result.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return result;
    }
}
