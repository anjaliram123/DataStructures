package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class PathWithMaxgold {

    public static void main(String[] args) {
        PathWithMaxgold p = new PathWithMaxgold();
        int [][] grid = {{0,6,0} , {5,8,7}, {0,9,0}};
        int ans = p.getMaximumGold(grid);
        System.out.println(ans);
    }
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int m = grid.length ; int n = grid[0].length;
        final int d [] = {0,1,0,-1,0};
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, getPath(grid, i, j, 0, d));
                }
            }
        }
        return maxGold;
    }

    public int getPath(int[][] grid, int i, int j, int sum, int d[]) {
        if(i < 0 || i >= grid.length || j <0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] > 100) {
            return sum;
        }
        sum = sum + grid[i][j];
        grid[i][j] += 1000; //visited;
        int mx = 0;
        for(int k=0;k<4;k++) {
            mx = Math.max(mx, getPath(grid, i+d[k], j+d[k+1], sum, d));
        }
        grid[i][j] -= 1000; //BACKTRACK
        return mx;
    }
}
