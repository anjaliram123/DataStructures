package DynamicProgramming;

import java.util.Arrays;

public class TripleStepMemoization {

    public static void main(String[] args) {
        TripleStepMemoization tsm = new TripleStepMemoization();
        int ways = tsm.countWays(3);
        System.out.println("Ways - "+ways);
    }

    public int countWays(int n) {
        int memo[] = new int[n+2];
        Arrays.fill(memo,-1);
        return countWays(n, memo);
    }

    public int countWays(int n, int[] memo) {
        if(n < 0){
            return 0;
        }
        else if(n==0) {
            return 1;
        }
        else if(memo[n] > -1) {
            return memo[n];
        }
        else {
            memo[n] = countWays(n-1,memo) + countWays(n-2,memo)+
                    countWays(n-3,memo);
        }
        return memo[n];
    }

}
