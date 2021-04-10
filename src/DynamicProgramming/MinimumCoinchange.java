package DynamicProgramming;

public class MinimumCoinchange {

    public static void main(String[] args) {
        MinimumCoinchange mc = new MinimumCoinchange();
        int coins[] = {1, 2, 3};
        int amount = 5;
        int min = mc.getMin(coins, amount);
        System.out.println(min);
    }

    public int getMin(int[] coins, int amount) {
        int solution[] = new int[amount + 1];
        solution[0] = 0;
        for (int i = 1; i <= amount; i++) {
            solution[i]=Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    solution[i] = Math.min(solution[i], solution[i - coins[j]] + 1);
                }
            }
        }
        return solution[amount];
    }
}
