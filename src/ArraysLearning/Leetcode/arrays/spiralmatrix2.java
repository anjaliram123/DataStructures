package ArraysLearning.Leetcode.arrays;

import java.util.List;

public class spiralmatrix2 {

    public static void main(String[] args) {
        spiralmatrix2 s = new spiralmatrix2();
        int[][] res = s.generateMatrix(3);
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                System.out.print(" "+res[i][j]);
            }
        }

    }

    public int[][] generateMatrix(int n) {
        int r1 = 0;
        int r2= n-1;
        int c1 =0;
        int c2 = n-1;
        int [][] res = new int[n][n];
        int count = 1;
        while(r1<=r2 && c1<=c2) {
            //first row
            for(int j=c1;j<=c2;j++) {
                res[r1][j] = count++;
            }

            //adding last column
            for (int i = r1 + 1; i <= r2; i++) {
                res[i][c2] = count++;
            }

            if(r1<r2 && c1<c2) {
                for (int j = c2 - 1; j > c1; j--) {
                    res[r2][j] = count++;
                }

                //adding first column
                for (int i = r2; i > r1; i--) {
                    res[i][c1] = count++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }
}
