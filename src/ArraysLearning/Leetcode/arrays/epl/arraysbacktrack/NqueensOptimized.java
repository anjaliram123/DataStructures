package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NqueensOptimized {


    public static void main(String[] args) {
        NqueensOptimized nq = new NqueensOptimized();
        int n = 4;
        List<List<String>> output = nq.solveNQueens(n);
        Iterator<List<String>> itr = output.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        int board[][] = new int[n][n];
        backtrack(n, 0, output, board);
        return output;
    }

    public void backtrack(int n, int row, List<List<String>> output, int board[][]) {
        if(row == n) {
            List<String> res = new ArrayList<>();
            for(int i=0 ; i<n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<n; j++) {
                    if(board[i][j] == 1) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                res.add(sb.toString());
            }
            output.add(res);
        }

        for(int col=0;col<n;col++) {
            if(isValid(board, n, row, col)) {
                board[row][col] = 1;
                backtrack(n, row+1, output, board);
                board[row][col] = 0;
            }
        }

    }

    public boolean isValid(int board[][], int n, int row, int col) {
        //check if columns are equal and if distance between rows and columns are equal(then it is diagonal)
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 1) {
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<n; i--,j++) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
