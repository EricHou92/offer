package A2_Leetcode.T2_Greedy;

/*
有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
		给定数组A及它的大小n，请返回最大差值。
		测试样例：
		[10,5],2
		返回：0
*/
public class LongestDistance {
	public static void main(String[] args) {
		int[] array = {10, 5, 7};
		int n = 3;
		System.out.println(getDis(array, n));
	}

	public static int getDis(int[] A, int n){
		//贪心算法
		int result = 0;
		int min = A[0];
		if(n>1){
			for(int i=1; i<n; i++){
				if(A[i]-min > result){
					result = A[i]-min;
				}
				if(min > A[i]){
					min = A[i];
				}
			}
		}
		return result;
	}
}