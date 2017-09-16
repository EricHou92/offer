package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N40_isPokerContinuous {

    //抽出5张牌,看看是不是顺子
    public boolean isContinuous(int[] nums) {
       /*
        1. 除0外没有重复的数
        2. max - min < 5
        */
       if(nums.length == 0)
           return false;
        int[] poker = new int[14];
        poker[0] = -5;
        int max = -1, min = 14;
        for(int i=0; i<nums.length; i++){
            poker[nums[i]]++;
            if(poker[nums[i]] > 1)
                return false;
            if(nums[i] == 0)
                continue;
            if(nums[i] > max)
                max = nums[i];
            if(nums[i] < min)
                min = nums[i];
        }
        if(max-min < 5)
            return true;
        return false;
    }

}
