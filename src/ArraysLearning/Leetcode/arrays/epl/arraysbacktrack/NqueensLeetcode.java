package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NqueensLeetcode {

    public static void main(String[] args) {
        NqueensLeetcode nq = new NqueensLeetcode();
        int n = 4;
        List<List<String>> output = nq.solveNQueens(n);
        Iterator<List<String>> itr = output.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        backtrack(n, 0, output, new ArrayList<>());
        return output;
    }

    public void backtrack(int n, int row, List<List<String>> output, List<Integer> colList) {
        if(row == n) {
            List<Integer> clist = new ArrayList<>(colList);
            List<String> res = new ArrayList<>();
            for(int i : clist) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<clist.size(); j++) {
                    if(j==i) {
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
            colList.add(col);
            if(isValid(colList)) {
                backtrack(n, row+1, output, colList);
            }
            colList.remove(colList.size()-1);
        }

    }

    public boolean isValid(List<Integer> colList) {
        //check if columns are equal and if distance between rows and columns are equal(then it is diagonal)
        int rowID = colList.size()-1;
        for(int i=0; i<rowID; i++) {
            int diff = Math.abs(colList.get(rowID) - colList.get(i));
            if(diff == 0 || diff == rowID - i) {
                return false;
            }
        }
        return true;
    }
}


