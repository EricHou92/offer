package A2_Leetcode.T2_Greedy;

public class LongestDistance {

	//给你一个下标从 0 开始的整数数组 nums ，该数组的大小为 n ，请你计算 nums[j] - nums[i] 能求得的 最大差值 ，其中 0 <= i < j < n 且 nums[i] < nums[j]
	public int maximumDifference1(int[] nums) {
		int left = 0;
		int right = 1;
		int res = -1;
		while(right<nums.length){
			if(nums[left]<nums[right]){
				res = Math.max(res,nums[right]-nums[left]);
			}else{
				left = right;
			}
			right++;
		}
		return res;
	}
}