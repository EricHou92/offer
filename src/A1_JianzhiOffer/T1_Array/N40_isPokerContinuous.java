package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N40_isPokerContinuous {

    //抽出5张牌,看看是不是顺子
    public boolean isStraight(int[] nums) {
       /*
        1. 除0外没有重复的数
        2. max - min < 5
        */
       if(nums.length == 0)
           return false;
        int[] poker = new int[14];
        poker[0] = -5;
        int max = -1, min = 14;
        for (int num : nums) {
            poker[num]++;
            if (poker[num] > 1)
                return false;
            if (num == 0)
                continue;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        return max - min < 5;
    }

}
