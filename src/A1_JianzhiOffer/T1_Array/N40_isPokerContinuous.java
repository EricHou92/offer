package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N40_isPokerContinuous {

    public boolean isContinuous(int[] numbers) {
       /*
        1. 除0外没有重复的数
        2. max - min < 5
        */
       if(numbers.length == 0)
           return false;
        int[] poker = new int[14];
        poker[0] = -5;
        int max = -1, min = 14;
        for(int i=0; i<numbers.length; i++){
            poker[numbers[i]]++;
            if(poker[numbers[i]] > 1)
                return false;
            if(numbers[i] == 0)
                continue;
            if(numbers[i] > max)
                max = numbers[i];
            if(numbers[i] < min)
                min = numbers[i];
        }
        if(max-min < 5)
            return true;
        return false;
    }

}
