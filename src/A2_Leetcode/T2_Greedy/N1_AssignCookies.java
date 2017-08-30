package A2_Leetcode.T2_Greedy;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N1_AssignCookies {

    //分饼干，孩子满意的个数
    public int findContentChildren(int[] g, int[] s){
        Arrays.sort(g); ////贪心算法，从g最小的开始遍历
        Arrays.sort(s);
        int i = 0;
        for(int j=0; i<g.length && j<s.length; j++) {
            if(g[i] <= s[j])
                i++;
        }
        return i;
    }

}
