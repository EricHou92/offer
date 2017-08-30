package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N3_JumpGame {

    //每个元素代表最大跳转长度，确定你是否能够达到数组末尾
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; i++) {
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
}
