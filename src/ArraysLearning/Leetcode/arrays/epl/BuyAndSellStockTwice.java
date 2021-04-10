package ArraysLearning.Leetcode.arrays.epl;

import java.util.ArrayList;
import java.util.List;

public class BuyAndSellStockTwice {

    public static void main(String[] args) {
        BuyAndSellStockTwice t = new BuyAndSellStockTwice();
        int nums [] = {12,11,13,9,12,8,14,13,15};
        int profit = t.maxProfit(nums);
        System.out.println("Max profit is "+profit);
    }

    public int maxProfit(int nums[]) {
        List<Integer> firstBuySellProfits = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            int profit = nums[i] - min;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
            firstBuySellProfits.add(maxProfit);
        }

        int maxPriceSoFar = Integer.MIN_VALUE ;
        for (int i = nums.length - 1; i > 0; --i) {
            maxPriceSoFar = Math.max(maxPriceSoFar , nums[i]);
            maxProfit
                    = Math.max(maxProfit , maxPriceSoFar - nums[i]
                    + firstBuySellProfits.get(i - 1));
        }
        return maxProfit ;

    }
}
