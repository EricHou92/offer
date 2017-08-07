package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N6_BubbleSort {

    public void bubbleSort(int[] nums){
        int temp;
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1-i; j++){ //每一次把最大的沉到底部
                if(nums[j] > nums[j+1]){  //交换两数位置
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
