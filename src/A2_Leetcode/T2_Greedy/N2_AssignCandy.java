package A2_Leetcode.T2_Greedy;

import java.util.Arrays;

public class N2_AssignCandy {

    //n个孩子站成一排。给你一个整数数组ratings表示每个孩子的评分。给这些孩子分发糖果：相邻两个孩子评分更高的孩子会获得更多的糖果。计算并返回需要准备的最少糖果数目
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for(int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
        }
        int count = left[ratings.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1])
                right[i] = right[i + 1] + 1;
            count += Math.max(left[i], right[i]);
        }
        return count;
    }

}
