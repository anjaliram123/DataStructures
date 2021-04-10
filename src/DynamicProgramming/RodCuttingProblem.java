package DynamicProgramming;

public class RodCuttingProblem {

    public static void main(String[] args) {
        RodCuttingProblem rc = new RodCuttingProblem();
        int values[] = {1,5,8,9,10,17,17,20,24,30};
        int prices[] = {1,2,3,4,5,6,7,8,9,10};
        int profit = rc.maxProfit(values, 5);
        System.out.println("Max Profit is "+profit);
    }


    public int maxProfit(int [] values, int length) {
        int solutions [] = new int[length+1];
        solutions[0]=0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=length;i++){
            for(int j=0;j<i;j++){
                max=Math.max(max, values[j]+solutions[i-(j+1)]);
                solutions[i]=max;
            }
        }
        return solutions[length];
    }
}
