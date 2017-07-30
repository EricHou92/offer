package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N16_UniquePath {

    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0;j<n;j++){
                if( i==0 || j==0){
                    map[i][j]=1;
                }
                else{
                    map[i][j] = map[i-1][j]+map[i][j-1];
                }
            }
        }
        return map[m-1][n-1];
    }
}
