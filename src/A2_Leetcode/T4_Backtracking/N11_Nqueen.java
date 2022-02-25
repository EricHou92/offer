package A2_Leetcode.T4_Backtracking;

import java.util.HashSet;
import java.util.Set;

public class N11_Nqueen {

    //N皇后问题是指在n*n的棋盘上要摆n个皇后，要求：任何两个皇后不同行，不同列，也不在同一条斜线上。求给一个整数n ，返回n皇后的摆法数。
    public int totalNQueens(int n) {
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        return backtrack(n, 0, columns, diagonals1, diagonals2);
    }

    public int backtrack(int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            return 1;
        } else {
            int result = 0;
            for (int column = 0; column < n; column++) {
                if(columns.contains(column) || diagonals1.contains(row - column) || diagonals2.contains(row + column)){
                    continue;
                }
                columns.add(column);
                diagonals1.add(row - column);
                diagonals2.add(row + column);
                result += backtrack(n, row + 1, columns, diagonals1, diagonals2);
                columns.remove(column);
                diagonals1.remove(row - column);
                diagonals2.remove(row + column);
            }
            return result;
        }
    }

}


