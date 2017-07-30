package A5_SeekJob.HuaWei.package1;

import java.util.Scanner;

public class N16_ShoppingList {

	/*带限制的0-1背包问题*/
	/*思路：首先把它转化为正常的0-1背包wenti，
	 *      把所有附件都加上主件的钱数和价值，就变成了普通的0-1背包
	 *      动态规划*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt(); // 总钱数
			int m = scanner.nextInt(); // 商品个数
			int[] p = new int[m];
			int[] v = new int[m];
			int[] q = new int[m];
			for (int i = 0; i < m; i++) {
				p[i] = scanner.nextInt();        // 价格
				v[i] = scanner.nextInt() * p[i]; // 价值
				q[i] = scanner.nextInt();        // 主or附件
			}
			System.out.println(getMaxValue(n, m, p, v, q));
		}
	}

	public static int getMaxValue(int w, int n, int[] weight, int[] val, int[] q) {
		int[][] dp = new int[n + 1][w + 1];
		for (int j = 1; j <= w; j++) {//循环商品总钱数
			for (int i = 1; i <= n; i++) {//循环商品个数
				if (q[i-1] == 0) {  // 主件
					if (j >= weight[i - 1]) // 用j这么多钱去买 i 件商品 可以获得最大价值
						dp[i][j] =
								Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
				}
				else { //附件
					if (j >= weight[i - 1] + weight[q[i - 1]]) //附件的话 加上主件一起算
						dp[i][j] =
								Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
				}
			}
		}
		return dp[n][w];
	}



}
