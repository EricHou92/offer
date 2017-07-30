package A2_Leetcode.T8_HashTable.package1;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N10_IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        //add 4 for each land and remove 2 for each internal edge
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i-1][j] == 1)
                        result -= 2;
                    if (j > 0 && grid[i][j-1] == 1)
                        result -= 2;
                }
            }
        }
        return result;
    }
}
