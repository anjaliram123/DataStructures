package ArraysLearning.Leetcode;

public class BestTimetoBuyAndSellStockWithCoolDown {

    public static void main(String[] args) {
        BestTimetoBuyAndSellStockWithCoolDown b = new BestTimetoBuyAndSellStockWithCoolDown();
        int a[] = {1,2,4};
        int profit = b.maxProfit(a);
        System.out.println(profit);
    }

    public int maxProfit(int[] prices) {
        int i=1;
        int maxprofit= 0;
        while(i<prices.length) {
            if(prices[i] > prices[i-1]) {
                maxprofit = maxprofit + (prices[i] - prices[i-1]);
                i=i+2;
            } else{
                i=i+1;
            }
        }

        return maxprofit;
    }
}
