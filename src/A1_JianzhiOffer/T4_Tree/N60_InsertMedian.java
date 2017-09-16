package A1_JianzhiOffer.T4_Tree;

import java.util.PriorityQueue;

/**
 * Created by ciciya on 2017/3/10.
 */
public class N60_InsertMedian {

    /*
    Java的PriorityQueue 是从JDK1.5开始提供的新的数据结构接口，默认内部是自然排序，结果为最小堆，
    也可以自定义排序器，比如下面反转比较，完成最大堆。
    思路：
    为了保证插入新数据和取中位数的时间效率都高效，这里使用大顶堆+小顶堆的容器，并且满足：
            1、两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处；
            2、大顶堆的所有数据都小于小顶堆，这样就满足了排序要求。
     */
    private int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, (o1, o2) -> o2 - o1);

    public void Insert(Integer num) {
        if (count %2 == 0) {
            //当数据总数为偶数时，新加入的元素，应当进入最小堆
            maxHeap.offer(num);
            int filteredMaxNum = maxHeap.poll();
            minHeap.offer(filteredMaxNum);
        } else {
            //当数据总数为奇数时，新加入的元素，应当进最大堆
            minHeap.offer(num);
            int filteredMinNum = minHeap.poll();
            //2.筛选后的【小根堆中的最小元素】进入小根堆
            maxHeap.offer(filteredMinNum);
        }
        count++;
    }

    public Double GetMedian() {
        if (count %2 == 0)
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        else
            return new Double(minHeap.peek());
    }
}
