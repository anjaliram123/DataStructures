package ArraysLearning.Leetcode.GoldmanSachs;

public class MatrixBlockSum {

    public static void main(String[] args) {
        MatrixBlockSum m = new MatrixBlockSum();
        int[][] res = new int[3][3];
        int[][] mat = { {1,2,3},{4,5,6},{7,8,9}};
        int K = 1;
        res = m.matrixBlockSum(mat,K);
        for(int i=0;i<res.length;i++) {
            for(int j=0; j<res[0].length;j++) {
                System.out.println(res[i][j]);
            }
        }

    }

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] dp = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                int rmin = i-K;
                int rmax = i+K;
                int cmin = j-K;
                int cmax = j+K;
                dp[i][j] = getSum(i, j, rmin,rmax,cmin,cmax,K,mat);
            }
        }
        return dp;
    }

    public int getSum(int i, int j, int rmin, int rmax, int cmin, int cmax, int K, int[][] mat) {
        if(rmin < 0){
            rmin = 0;
        }
        if(rmax >= mat.length) {
            rmax = mat.length -1;
        }
        if(cmin < 0) {
            cmin = 0;
        }
        if(cmax >= mat[0].length) {
            cmax = mat[0].length - 1;
        }
         int sum = 0;
        int count = 0;
        for(int row=rmin ; row<=rmax; row++) {
            for(int col=cmin ; col<=cmax; col++) {
                sum = sum + mat[row][col];
                count ++;
            }
        }
        return sum;
    }


}
