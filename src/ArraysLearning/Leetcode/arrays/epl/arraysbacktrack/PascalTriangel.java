package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangel {

    public static void main(String[] args) {
        PascalTriangel p = new PascalTriangel();
        p.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> currRow = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j>0 && j<i) {
                    currRow.add(pascalTriangle.get(i-1).get(j-1)+pascalTriangle.get(i-1).get(j));
                } else {
                    currRow.add(1);
                }
            }
            pascalTriangle.add(currRow);
        }
        return pascalTriangle;
    }
}
