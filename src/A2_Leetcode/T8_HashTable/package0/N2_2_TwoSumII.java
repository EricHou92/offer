package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_2_TwoSumII {
    //两个指针
    public int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        if (num == null || num.length < 2)
            return result;
        int low = 0;
        int high = num.length - 1;
        while (low < high) {
            int sum = num[low] + num[high];
            if (sum == target) {
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return result;
    }
}
