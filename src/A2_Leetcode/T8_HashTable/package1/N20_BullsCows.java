package A2_Leetcode.T8_HashTable.package1;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N20_BullsCows {

    public String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        int[] count = new int[10];
        for(int i=0; i<count.length; i++){
            int sec = secret.charAt(i)-'0';
            int gue = guess.charAt(i)-'0';
            if(sec == gue)
                A++;
            else{
                if(count[sec]<0)
                    B++;
                if(count[gue]>0)
                    B++;
                count[sec]++;
                count[gue]--;
            }
        }
        return A + "A" + B + "B";
    }
}
