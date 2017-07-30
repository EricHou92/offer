package A2_Leetcode.T8_HashTable.package1;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N19_2_SudokuSolver {

    //回溯法
    /*第一反应就是N皇后问题。就是一点点尝试着填数，不行的话就回溯，直到都填满就返回。
    如果对一个格子尝试从0~9都不行，那么说明整个sudoku无解，返回false就好。
    对整个棋盘所有'.'都填完了，那么就可以返回true了。*/
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        helper(board);
    }

    private boolean helper(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell
                            if(helper(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == c)
                return false; //check row
            if(board[row][i] != '.' && board[row][i] == c)
                return false; //check column
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false; //check 3*3 block
        }
        return true;
    }
}
