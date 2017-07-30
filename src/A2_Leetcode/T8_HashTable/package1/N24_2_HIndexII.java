package A2_Leetcode.T8_HashTable.package1;

/**
 * Created by ciciya on 2017/5/23.
 */
public class N24_2_HIndexII {

    //题设已经递增排序
    public int hIndex(int[] citations) {
        int len = citations.length;
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            int middle = (high + low) / 2;
            if (citations[middle] == len - middle) {
                return len - middle;
            } else if (citations[middle] < len - middle) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return len - low;
    }
}
