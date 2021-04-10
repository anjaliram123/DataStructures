package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {

    public static void main(String[] args) {
        Nqueens n = new Nqueens();
        List<List<Integer>> res = n.solveNQueens(4);

    }

    public List<List<Integer>> solveNQueens(int n) {
        List<List<Integer>> op = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        backtrack(op, res, 0, n);
        return op;
    }

    public void backtrack(List<List<Integer>> op , List<Integer> res, int row, int n) {
        if(row == n) {
            op.add(new ArrayList<>(res));
        }

        for(int col=0;col<n;col++) {
            res.add(col);
            if(isvalid(res)){
                backtrack(op, res, row+1, n);
            }
            res.remove(res.size()-1);
        }
    }

    public boolean isvalid(List<Integer> res) {
        int rowId = res.size() -1;
        for(int i=0; i<rowId;i++) {
            int col2 = res.get(i);
            int diff = Math.abs(res.get(rowId) - res.get(i));
            if(diff == 0 || diff == rowId - i) {
                return false;
            }
        }
        return true;
    }

}
