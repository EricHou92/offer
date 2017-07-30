package A1_JianzhiOffer.T5_StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by ciciya on 2017/3/10.
 */
public class N61_maxInWindows {

    public int[] maxSlidingWindow(int[] array, int k) {
        if (array == null || k <= 0)
            return new int[0];
        int[] result = new int[array.length-k+1];
        int ri = 0;
        // store index,双向队列(Deque),是Queue的一个子接口
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<array.length; i++) {
            // remove numbers out of range k
            while (!deque.isEmpty() && deque.peek() < i-k+1) {
                deque.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!deque.isEmpty() && array[deque.peekLast()] < array[i]) {
                deque.pollLast();
            }
            // deque contains index... result contains content
            deque.offer(i);
            if (i >= k - 1) {
                result[ri++] = array[deque.peek()];
            }
        }
        return result;
    }

}
