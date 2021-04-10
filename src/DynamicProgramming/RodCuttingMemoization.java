package DynamicProgramming;

public class RodCuttingMemoization {

    public static int profit(int values[], int len) {
        int solution[] = new int[len+1];
        solution[0]=0;
        for(int i=1;i<=len;i++){
            int max = -1;
            for(int j=0;j<i;j++){
                max = Math.max(max, values[j] + solution[i-(j+1)]);
                solution[i]=max;
            }
        }
        return solution[len];
    }

    public static void main(String[] args) {
        int [] values = {2,3,7,8,9};
        int len = 5;
        System.out.println("Max proft is " + profit(values,len));
    }
}
