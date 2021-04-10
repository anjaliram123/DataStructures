package ArraysLearning.Leetcode.arrays.epl;

public class BuyandSellStock {

    public static void main(String[] args) {
        BuyandSellStock b = new BuyandSellStock();
        int nums [] = {310,315, 275, 295, 260, 270, 290, 230, 255, 250};
        int profit = b.maxProfit(nums);
        System.out.println("Max profit is "+profit);
    }

    public int maxProfit(int nums[]) {
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
        }
        return maxProfit;
    }
}
