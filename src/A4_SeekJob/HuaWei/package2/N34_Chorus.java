package A4_SeekJob.HuaWei.package2;

import java.util.Scanner;

/**
 * @author ciciya
 *其算法原型是求最长递增子序列长度，利用动态规划dp恰好解决，
 *先从左到右求出最长递增子序列， 再从右到左求出最长递增子序列，
 *最后求两者之和的最大值
 */
public class N34_Chorus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] num = new int[n];
			int[] left = new int[n];
			int[] right = new int[n];
			int max = 0;
			for(int i=0; i<n; i++)
				num[i] = scanner.nextInt();

			for(int i=0; i<n; i++){
				left[i] = 1;
				for(int j=0; j<i; j++){
					if(num[j]<num[i])
						left[i] = Math.max(left[i], left[j]+1);
				}
			}

			for(int i=n-1; i>=0; i--){
				right[i] = 1;
				for(int j=n-1; j>i; j--){
					if(num[j]<num[i])
						right[i] = Math.max(right[i], right[j]+1);
				}
				max = Math.max(max, left[i]+right[i]-1);
			}

			System.out.println(num.length - max);
		}
	}
}
