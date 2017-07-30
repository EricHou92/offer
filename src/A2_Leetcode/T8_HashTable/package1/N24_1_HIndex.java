package A2_Leetcode.T8_HashTable.package1;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/5/23.
 */
public class N24_1_HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations); // 排序
        int result = 0;
        for(int i=0; i<citations.length; i++){
            int currH = Math.min(citations[i], citations.length - i); // 得到当前的H指数
            if(currH > result)
                result = currH;
        }
        return result;
    }
}
