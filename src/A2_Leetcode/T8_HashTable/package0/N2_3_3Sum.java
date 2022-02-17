package A2_Leetcode.T8_HashTable.package0;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ciciya on 2017/5/11.
 */
public class N2_3_3Sum {

    //给你一个包含n个整数的数组nums，判断nums中是否存在三个元素a，b，c，使得a+b+c=0？请你找出所有和为0且不重复的三元组
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || num[i] != num[i - 1]) {
                int low = i+1;
                int high = num.length-1;
                int sum = 0 - num[i];
                while (low < high) {
                    if (num[low] + num[high] == sum) {
                        result.add(Arrays.asList(num[i], num[low], num[high]));
                        while (low < high && num[low] == num[low +1])
                            low++; //skip equal elements to avoid duplicates
                        while (low < high && num[high] == num[high -1])
                            high--;
                        low++;
                        high--;
                    } else if (num[low] + num[high] < sum)
                        low++;
                    else
                        high--;
                }
            }
        }
        return result;
    }
}
