package ArraysLearning.Leetcode.GoldmanSachs;

public class MatrixBlockSum2 {

    public static void main(String[] args) {
        MatrixBlockSum2 m = new MatrixBlockSum2();
        int[][] res;
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
        int m = mat.length, n = mat[0].length;
        int k = K;
        int[][] sum = new int[m+1][n+1];

        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++){
                sum[i+1][j+1] = mat[i][j] + sum[i+1][j] + sum[i][j+1] - sum[i][j];
            }

        int[][] res = new int[m][n];
            for(int i=0; i<m; i++)
                for(int j=0; j<n; j++){
                    int x2 = Math.min(m-1, i +k);
                    int y2 = Math.min(n-1, j+k);
                    int x1 = Math.max(0, i-k);
                    int y1 = Math.max(0, j-k);
                    res[i][j]  =  sum[x2+1][y2+1] - sum[x2+1][y1] - sum[x1][y2+1] + sum[x1][y1];
                }

            return res;
        }
    }

