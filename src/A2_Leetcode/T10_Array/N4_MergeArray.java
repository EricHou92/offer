package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/4.
 */
public class N4_MergeArray {

    //给定两个排序整数数组nums1和nums2，将nums2合并为nums1作为一个排序的数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >=0 && j>=0){
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while(j>=0)
            nums1[k--] = nums2[j--];
    }
}
