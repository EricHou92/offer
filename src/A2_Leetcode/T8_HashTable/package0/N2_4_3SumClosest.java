package A2_Leetcode.T8_HashTable.package0;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/6/11.
 */
public class N2_4_3SumClosest {

    //给你一个整数数组nums和一个目标值target。请你从 nums 中选出三个整数，使它们的和与target最接近。返回这三个数的和
    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[2];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int low = i + 1;
            int high = num.length - 1;
            while (low < high) {
                int sum = num[i] + num[low] + num[high];
                if (sum > target) {
                    high--;
                } else {
                    low++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
