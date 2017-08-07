package A3_SortSearch;

/**
 * Created by ciciya on 2017/8/7.
 */
public class N3_HeapSort {

    public void heapSort(int[] nums) {
        for (int i=nums.length/2; i>=0; i--) {  // 循环建立初始最大堆
            maxHeap(nums, i, nums.length-1);
        }
        for (int i=nums.length-1; i>0; i--) {  // 最后一个元素和第一元素进行交换
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            maxHeap(nums, 0, i);  // 筛选 R[0] 结点，得到i-1个结点的堆
        }
    }

    public void maxHeap(int[] nums, int parent, int high) {
        int temp = nums[parent]; // temp保存当前父节点
        int child = 2 * parent + 1; // 先获得左孩子
        while (child <= high) {
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (child + 1 < high && nums[child] < nums[child + 1]) {
                child++;
            }
            if (temp >= nums[child])    // 如果父结点的值已经大于孩子结点的值，则直接结束
                break;
            nums[parent] = nums[child];   // 把孩子结点的值赋给父结点
            parent = child;   // 选取孩子结点的左孩子结点,继续向下筛选
            child = 2 * child + 1;
        }
        nums[parent] = temp;
    }

}
