package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/28.
 */
public class N1_MergeSort {

    public void mergeSort(int[] nums, int low, int high) {
        int mid = (low + high) >> 1;
        if(low < high) {
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int k = 0;
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        // 把较小的数先移到新数组中
        while(i <= mid && j <= high) {
            if(nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i <= mid) {
            temp[k++] = nums[i++];
        }
        // 把右边边剩余的数移入数组
        while(j <= high) {
            temp[k++] = nums[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }

}
