package DynamicProgramming;

public class TripleStep {

    public static void main(String[] args) {

        TripleStep ts = new TripleStep();
        int ways = ts.countWays(10);
        System.out.println("Ways - "+ways);
    }
//if we give value as n=100 it will take forever for this recursion so use memoization.
    private int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        else if(n==0) {
            return 1;
        }
        else
        {
            return countWays(n-1)+countWays(n-2)+countWays(n-3);
        }
    }
}
