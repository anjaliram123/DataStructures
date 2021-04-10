package ArraysLearning.Leetcode.GoldmanSachs;

public class UniquePathsWithObstaclesNoextraSpace {

    public static void main(String[] args) {
        UniquePathsWithObstaclesNoextraSpace un = new UniquePathsWithObstaclesNoextraSpace();
        int [][] obs = {{0,0,0}, {0,1,0}, {0,0,0}};
        int up = un.uniquePathsWithObstacles(obs);
        System.out.println("The unique paths are " +up);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        obstacleGrid[0][0]=1;
        //if any obstacle in 1st column path is nt possible
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
            } else {
                obstacleGrid[i][0] = 1;
            }
        }
        //if any obstacle in 1st row path is nt possible
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                obstacleGrid[0][j] = 0;
            } else {
                obstacleGrid[0][j] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1] + obstacleGrid[i - 1][j];
                }
            }
        }

        return obstacleGrid[m - 1][n - 1];
    }
}
