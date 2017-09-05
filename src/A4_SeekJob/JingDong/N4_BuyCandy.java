package A4_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N4_BuyCandy {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int v = scanner.nextInt();
            int[] weight = new int[n];
            int[] value = new int[n];
            for(int i=0; i<n; i++){
                weight[i] = scanner.nextInt();
                value[i] = scanner.nextInt();
            }
            int dp[][] = BackPack_Solution(v, n, weight, value);
            int max = dp[n][v];
            if(max == 0){
                System.out.print(max + " " + "\n" + "No" + "\n");
            }
            else {
                System.out.print(max + " " + "\n");
                //求解背包组成

            }
        }
    }

    /**
     * @param m 表示背包的最大容量
     * @param n 表示商品个数
     * @param w 表示商品重量数组
     * @param p 表示商品价值数组
     */
    public static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
        //c[i][m]表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
        int c[][] = new int[n+1][m+1];
        for (int i = 0; i < n + 1; i++)
            c[i][0] = 0;
        for (int j = 0; j < m + 1; j++)
            c[0][j] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if (j >= w[i - 1]) {
                    if ((c[i - 1][j - w[i - 1]] + p[i - 1]) > c[i-1][j])
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    else
                        c[i][j] = c[i - 1][j];
                } else
                    c[i][j] = c[i - 1][j];
            }
        }
        return c;
    }
}
