package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/23.
 */
public class N32_InversePairs {

    //归并排序改进
    public int InversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int low, int high){
        if(low >= high)
            return 0;
        int mid = (low + high)/2;
        int result = mergeSort(nums, low, mid) + mergeSort(nums, mid+1, high);
        //左：3 6 8右：1 2 4
        for(int i=low, j=mid+1; i<=mid; i++){
            while(j <= high && nums[i] > nums[j])
                j++;
            result += j-(mid+1);
        }
        //Arrays.sort(nums, low, high+1);  //相当于merge
        merge(nums, low, mid, high);
        return result;
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
