package DynamicProgramming;

public class Tribonacci {

    public static void main(String[] args) {
        Tribonacci t = new Tribonacci();
        int x = t.tribonacci(4);
        System.out.println("Number is " +x);
    }

    public int tribonacci(int n) {
        int memo[] = new int[n+1];
        memo[0] = 0;
        memo[1]  = 1;
        memo[2] = 1;
        int x = getTribonnaci(n,n,memo);
        return x;
    }

    public int getTribonnaci(int i, int n, int memo[]) {
        if (i == 0) {
            return 0;
        }

        if (i > n) {
            return 0;
        }

        if (memo[i] != 0) {
            return memo[i];
        }

        memo[i] = getTribonnaci(i - 1, n, memo) + getTribonnaci(i - 2, n, memo) + getTribonnaci(i - 3, n, memo);

        return memo[i];
    }
}
