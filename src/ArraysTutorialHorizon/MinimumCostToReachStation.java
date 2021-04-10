package ArraysTutorialHorizon;

public class MinimumCostToReachStation {
    //we always go from i to j
    //so j is always greater than i
    //do it using dynamic programming
    //where result[] array is used to store minimum cost for i and j
    //for N stations we have 0 to (N-1) routes and costs related to it.
    //space complexity is o(N) and time complexity is o(N2).
    static int INF = Integer.MAX_VALUE,N = 4;
    public static void main(String[] args) {

        int cost[][] = { {0, 15, 80, 90},
                {INF, 0, 40, 50},
                {INF, INF, 0, 70},
                {INF, INF, INF, 0}
        };
        MinimumCostToReachStation mc = new MinimumCostToReachStation();
        int minimumCost = mc.getMinmumCost(cost,N);
        System.out.println("The minimum cost is "+minimumCost);
    }

    public int getMinmumCost(int cost[][], int N){

        int result[] = new int[N];

        for(int i=0;i<result.length;i++){
            result[i] = INF;
        }
        result[0]=0;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(result[j] > result[i]+cost[i][j])
                {
                    result[j]= result[i]+cost[i][j];
                }
            }
        }
        return result[N-1];
    }




}
