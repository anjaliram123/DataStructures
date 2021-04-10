package ArraysLearning.Leetcode;

public class BestTimeToBuySellStockInterviewQuestion {

    public static void main(String[] args) {
        BestTimeToBuySellStockInterviewQuestion b = new
                BestTimeToBuySellStockInterviewQuestion();
        //int a[] = {7,1,5,3,6,4};
        int a[] = {1,2,3,4,5};
        int profit = b.maxProfit(a);
        System.out.println("The profit is " +profit);
    }

    public int maxProfit(int a[] ) {
        int maxprofit = 0;
        for(int i=1;i<a.length;i++) {
            if(a[i] > a[i-1]) {
                maxprofit = maxprofit + (a[i] - a[i-1]);
            }
        }
        return maxprofit;
    }
}
