package A1_JianzhiOffer.T5_StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ciciya on 2017/3/10.
 */
public class N61_maxInWindows {

    //给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2)
            return nums;
        int[] result = new int[nums.length-k+1];
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0;i < nums.length;i++){
            // 保证从大到小 如果前面数小则需要依次弹出，直至满足要求
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast();
            // 添加当前值对应的数组下标
            deque.addLast(i);
            // 判断当前队列中队首的值是否有效
            if(deque.peek() <= i-k)
                deque.poll();
            // 当窗口长度为k时 保存当前窗口中最大值
            if(i+1 >= k)
                result[i+1-k] = nums[deque.peek()];
        }
        return result;
    }

}
