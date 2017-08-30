package A2_Leetcode.T2_Greedy;

public class LongestDistance {

	//长度为n的数组A，0≤a≤b<n，返回A[b]-A[a]的最大值
	public int getDis(int[] A, int n){
		int result = 0;
		int min = A[0];
		if(n > 1){
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