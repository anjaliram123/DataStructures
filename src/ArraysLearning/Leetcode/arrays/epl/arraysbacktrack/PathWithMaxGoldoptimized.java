package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class PathWithMaxGoldoptimized {

    public static void main(String[] args) {
        PathWithMaxGoldoptimized pd = new PathWithMaxGoldoptimized();
        int [][] grid = {{0,6,0} , {5,8,7}, {0,9,0}};
        int ans = pd.getMaximumGold(grid);
        System.out.println(ans);
    }

    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int m = grid.length ; int n = grid[0].length;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, getPath(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    public int getPath(int[][] grid, int row, int col) {
        int currval = grid[row][col];
        grid[row][col] = 0;
        int currmax = 0;

        if( row+1 < grid.length && grid[row+1][col] != 0) {
            currmax = Math.max(currmax, getPath(grid, row+1, col));
        }
        if(col + 1 < grid[0].length && grid[row][col+1] != 0) {
            currmax = Math.max(currmax, getPath(grid, row, col+1));
        }
        if(row -1 >= 0 && grid[row-1][col] != 0) {
            currmax = Math.max(currmax, getPath(grid, row-1, col));
        }
        if(col - 1 >= 0 && grid[row][col-1] != 0) {
            currmax = Math.max(currmax, getPath(grid, row, col-1));
        }
        grid[row][col] = currval;
        return currval + currmax;
    }
}
