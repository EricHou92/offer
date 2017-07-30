package A2_Leetcode.T8_HashTable.package1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/22.
 */
public class N19_1_ValidSudoku {

    //只需判断已经填入的数字是否合法，那么需要判断每行每列以及每个9宫格的数字是否有重复
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            Set<Character> rows = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int j=0; j<9; j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3) + j/3;
                int ColIndex = 3*(i%3) + j%3;
                if(board[RowIndex][ColIndex]!='.' && !cube.add(board[RowIndex][ColIndex]))
                    return false;
            }
        }
        return true;
    }
}
