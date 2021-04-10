package DynamicProgramming;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        MinCostClimbingStairs m = new MinCostClimbingStairs();
        int cost[] = {10,15,20};
        int minCost = m.minCostClimbingStairs(cost);
        System.out.println("The min cost is "+minCost);
    }

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int memo[] = new int[cost.length];
        int sum = 0;
        memo[0] = cost[0];
        memo[1] = cost[1];
        for(int i = 2;i<cost.length;i++) {
            memo[i] = Math.min(memo[i-1]+cost[i], memo[i-2]+cost[i]);
        }
        return Math.min(memo[memo.length-1], memo[memo.length-2]);
    }
}
