package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N10_reOrderArray {

    public void reOrderArray(int[] nums) {
/*      时间复杂度为O（n），空间复杂度为O（n）,
        整体思路:首先统计奇数的个数
        然后新建一个等长数组，设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数*/
        if(nums.length==0 || nums.length==1)
            return;
        int oddBegin = 0;
        int oddCount = 0;
        int[] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            if((nums[i]&1) == 1)
                oddCount++;
        }
        for(int i = 0; i< nums.length; i++){
            if((nums[i]&1) == 1)
                temp[oddBegin++] = nums[i];
            else
                temp[oddCount++] = nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = temp[i];
        }
    }
}
