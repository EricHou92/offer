package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N2_QuickSort{

    //快排，分治算法
    public int[] MySort (int[] arr) {
        quickSort(arr , 0 , arr.length-1);
        return arr;
    }

    public void quickSort(int[] nums, int low, int high){
        if(low < high){
            int mid = partition(nums, low, high); //将numbers数组进行一分为二
            quickSort(nums, low, mid-1);   //对低字段表进行递归排序
            quickSort(nums, mid+1, high); //对高字段表进行递归排序
        }
    }

    private int partition(int[] nums, int low, int high) {
        int temp = nums[low]; //数组的第一个作为划分元素
        while(low < high){
            while(low<high && nums[high]>=temp){
                high--;
            }
            if(nums[high] < temp){
                int temp1 = nums[high];
                nums[high] = nums[low];
                nums[low] = temp1;
            }
            while(low<high && nums[low]<=temp){
                low++;
            }
            if(nums[low] > temp){
                int temp1 = nums[low];
                nums[low] = nums[high];
                nums[high] = temp1;
            }
        }
        return low ;
    }

}
