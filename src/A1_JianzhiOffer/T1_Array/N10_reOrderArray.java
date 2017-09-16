package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N10_reOrderArray {

    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
    // 并保证奇数和奇数，偶数和偶数之间的相对位置不变
    //方法：  统计奇数的个数,然后新建一个等长数组，设置两个指针，奇数指针从0开始，偶数指针从奇数个数的末尾开始 遍历，填数
    public void reOrderArray(int[] nums) {
        if(nums.length==0 || nums.length==1)
            return;
        int odd = 0;
        int count = 0;
        int[] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            if((nums[i]&1) == 1)
                count++;
        }
        for(int i = 0; i< nums.length; i++){
            if((nums[i]&1) == 1)
                temp[odd++] = nums[i];
            else
                temp[count++] = nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = temp[i];
        }
    }
}
