package DynamicProgramming;

public class RodCuttingNaive {

    public static int profit(int values[], int len) {

        if(len <=0) {
            return 0;
        }
        int max = -1;
        for(int i=0;i<len;i++) {
            max = Math.max(max, values[i]+profit(values, len-(i+1)));
        }
        return max;
    }

    public static void main(String[] args) {
        int [] values = {2,3,7,8,9};
        int len = 5;
        System.out.println("Max proft is " + profit(values,len));
    }
}
