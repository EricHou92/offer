package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N13_1_IslandNumber {

    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    search(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void search(char[][] grid, int x, int y) {
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!='1')
            return;
        grid[x][y] = '0';
        search(grid, x-1, y);
        search(grid, x+1, y);
        search(grid, x, y-1);
        search(grid, x, y+1);
    }
}
