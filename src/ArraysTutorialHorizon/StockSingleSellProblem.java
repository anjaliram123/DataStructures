package ArraysTutorialHorizon;

public class StockSingleSellProblem {

    public static void main(String[] args) {

        int[] prices = {200,500,1000,700,30,400,900,400,50};
        StockSingleSellProblem s = new StockSingleSellProblem();
        int maxprofit = s.getmaxProfit(prices);
        System.out.println(maxprofit);
    }

    public int getmaxProfit(int [] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int j=i+1;
            while(j<prices.length) {
                if(prices[i] > prices[j]){

                }else {
                    maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
                }
                j++;
            }
        }
        return maxProfit;
    }
}
