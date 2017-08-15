package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.List;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N20_WordBreak {

    public boolean wordBreak(String s, List<String> dict) {
        boolean[] f = new boolean[s.length() + 1];  //到字符串s的第i个元素为止, 能不能用字典中的词来表示
        f[0] = true;
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
}
