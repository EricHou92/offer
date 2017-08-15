package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/23.
 */
public class N7_MinPathSum {

    //每次向下，向右一步，求最小路径和
    public int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j!=0)
                    grid[i][j] += grid[i][j-1];
                if(i!=0 && j==0)
                    grid[i][j] += grid[i-1][j];
                if(i!=0 && j!=0)
                    grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        return grid[m-1][n-1];
    }
}
