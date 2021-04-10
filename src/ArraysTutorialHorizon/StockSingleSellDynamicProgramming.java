package ArraysTutorialHorizon;

public class StockSingleSellDynamicProgramming {

    public static void main(String[] args) {
        int[] prices = {200,500,1000,700,30,400,900,400,50};
        StockSingleSellDynamicProgramming s = new StockSingleSellDynamicProgramming();
        int maxprofit = s.getmaxProfit(prices);
        System.out.println(maxprofit);
    }

    public int getmaxProfit(int [] prices) {
        int n = prices.length;
        int maxprice = prices[n-1];
        int buyindex = 0;
        int sellindex = 0;
        int currentprofit = 0;
        int tempIndex = 0;

        for(int i=n-2;i>0;i--){
            if(maxprice < prices[i]){
                maxprice = prices[i];
                tempIndex = i;
            }else if(maxprice > prices[i]){
                if(currentprofit > maxprice - prices[i]){
                    currentprofit = maxprice - prices[i];
                    buyindex = i;
                    sellindex = tempIndex;
                }
            }
        }


        System.out.println("buyindex " +buyindex);
        System.out.println("sellindex " +sellindex);
       return currentprofit;
    }
}
