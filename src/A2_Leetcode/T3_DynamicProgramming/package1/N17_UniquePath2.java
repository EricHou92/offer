package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N17_UniquePath2 {

    public int uniquePathsWithObstacles(int[][] map) {
        if(map.length == 0)
            return 0;
        int m = map.length;
        int n = map[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1)
                    map[i][j] = 0;
                else if(i == 0 && j == 0)
                    map[i][j] = 1;
                else if(i == 0)
                    map[i][j] = map[i][j - 1];
                else if(j == 0)
                    map[i][j] = map[i - 1][j];
                else
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }
        return map[m - 1][n - 1];
    }
}
