package A2_Leetcode.T8_HashTable.package0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_5_4Sum {

    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (num.length < 4)
            return result;
        Arrays.sort(num);
        for (int i=0; i < num.length - 3; i++) {
            if (i==0 || (i > 0 && num[i] != num[i - 1])) {
                for (int j=i+1; j < num.length - 2; j++) {
                    if (j==i+1 || (j > i+1 && num[j] != num[j - 1])) {
                        int low = j + 1;
                        int high = num.length - 1;
                        while (low < high) {
                            int sum = num[i] + num[j] + num[low] + num[high];
                            if (sum == target) {
                                result.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                                while (low < high && num[low] == num[low + 1])
                                    low++;
                                while (low < high && num[high] == num[high - 1])
                                    high--;
                                low++;
                                high--;
                            } else if (sum < target)
                                low++;
                            else
                                high--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
