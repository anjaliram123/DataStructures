package ArraysLearning.Leetcode.GoldmanSachs;

public class RangeSum2dquery {

    public static void main(String[] args) {
        RangeSum2dquery r = new RangeSum2dquery();
        int matrix[][] ={{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        int dp[][] = r.getMatrix(matrix);
        for(int i=0;i<dp.length;i++) {
            for(int j=0; j<dp[0].length;j++) {
                System.out.println(dp[i][j]);
            }
        }
        int res = r.sumRegion(2,1,4,3,dp);
    }


    public int[][] getMatrix (int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return null;
       int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                dp[r + 1][c + 1] = dp[r + 1][c] + dp[r][c + 1] + matrix[r][c] - dp[r][c];
            }
        }
        return dp;
    }

    public int sumRegion(int row1, int col1, int row2, int col2, int dp[][]) {
        return dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1];
    }
}
