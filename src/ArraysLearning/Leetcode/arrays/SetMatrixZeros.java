package ArraysLearning.Leetcode.arrays;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
        SetMatrixZeros s = new SetMatrixZeros();
        //int matrix [][]= {{1,1,1},{1,0,1},{1,1,1}};
        int matrix [][]= {{0,1,4,0},{2,3,1,2},{4,0,7,0}};
        s.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        boolean[] visited = new boolean[matrix[0].length];
        boolean clearRow = false;
        for(int i = 0; i<matrix.length;i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(!visited[j]) {
                    if (matrix[i][j] == 0) {
                        visited[j]=true;
                        for (int k = 0; k < matrix.length; k++) {
                            matrix[k][j] = 0;
                        }
                        clearRow = true;
                    }
                }
            }
            if(clearRow) {
                Arrays.fill(matrix[i],0);
                clearRow = false;
            }
        }

        for(int i = 0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
