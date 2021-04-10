package ArraysTutorialHorizon;

public class MaximumSubArrayDP {

    public static void main(String[] args) {
        int input [] ={-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArrayDP m = new MaximumSubArrayDP();
        int x= m.maxsubarray(input);
        System.out.println(x);
    }

    public int maxsubarray(int []a){
        int dp[] = new int[a.length];
        dp[0]=a[0];
        int max = dp[0];
        for(int i=1;i<a.length;i++){
            dp[i]=a[i]+(dp[i-1]>0 ? dp[i-1]:0);
            max = Math.max(max,dp[i]);
        }
        return max;
    }


}
