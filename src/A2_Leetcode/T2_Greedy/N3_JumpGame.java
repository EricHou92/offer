package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N3_JumpGame {

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
