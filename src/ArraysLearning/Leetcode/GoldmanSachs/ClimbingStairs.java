package ArraysLearning.Leetcode.GoldmanSachs;

public class ClimbingStairs {


    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        System.out.println(c.climbStairs(5));
    }

    public int climbStairs(int n) {
        //Top down approach
        int memo [] = new int[n+1];
        int ways = climbWays(n,memo);
        return ways;
    }

    public int climbWays(int n, int memo[]) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        if(memo[n] != 0) {
            return memo[n];
        }

        memo[n] = climbWays(n-1, memo) + climbWays(n-2, memo);
        return memo[n];
    }
}

