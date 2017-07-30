package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/13.
 */
public class N5_CountSay {

    public String countAndSay(int n) {
        StringBuffer curr = new StringBuffer("1");
        for (int i=1; i<n; i++){
            StringBuffer prev = curr;
            curr = new StringBuffer();
            int count = 1;
            char say = prev.charAt(0);
            for (int j=1; j<prev.length(); j++){
                if (prev.charAt(j) != say){
                    curr.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                }
                else
                    count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();

    }
}
