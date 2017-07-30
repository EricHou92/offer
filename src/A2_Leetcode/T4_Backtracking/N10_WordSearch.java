package A2_Leetcode.T4_Backtracking;

/**
 * Created by ciciya on 2017/6/7.
 */
public class N10_WordSearch {

    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int y=0; y<board.length; y++) {
            for (int x=0; x<board[y].length; x++) {
                if (exist(board, y, x, w, 0, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int y, int x, char[] w, int i, boolean[][] visited) {
        if (i == w.length)
            return true;
        if (y<0 || x<0 || y == board.length || x == board[y].length || visited[y][x] || board[y][x] != w[i])
            return false;
        visited[y][x] = true;
        boolean exist = exist(board, y, x+1, w, i+1, visited)
                || exist(board, y, x-1, w, i+1, visited)
                || exist(board, y+1, x, w, i+1, visited)
                || exist(board, y-1, x, w, i+1, visited);
        visited[y][x] = false;
        return exist;
    }
}
