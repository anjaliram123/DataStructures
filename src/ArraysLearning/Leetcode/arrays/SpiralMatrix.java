package ArraysLearning.Leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //T(N) is O[N] as we are looping over element only once
    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix();
        int [][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};
        List<Integer> res = s.spiralOrder(matrix);
        res.forEach(System.out::println);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int r1 = 0; int c1= 0;
        int r2 = matrix.length-1; int c2 = matrix[0].length-1;

        List<Integer> res = new ArrayList<>();
        while (r1 <= r2 && c1 <= c2) {
            //adding first row
            for (int j = c1; j <= c2; j++) {
                res.add(matrix[r1][j]);
            }

            //adding last column
            for (int i = r1 + 1; i <= r2; i++) {
                res.add(matrix[i][c2]);
            }

            //adding last row
            //if the belwo if condition is not there it will add extra elements
            //for exmple if we have {{3},{2}} it should be [3,2] but result will be [3,2,2]
            if(r1<r2 && c1<c2 ) {
                for (int j = c2 - 1; j > c1; j--) {
                    res.add(matrix[r2][j]);
                }

                //adding first column
                for (int i = r2; i > r1; i--) {
                    res.add(matrix[i][c1]);
                }
            }
            // we are having while loop here because we want to consider this
            //pattern for inner rows and columns
            // for first iteration we only did outer loops
            r1++;
            r2--;
            c1++;
            c2--;
        }

        return res;
    }
}
