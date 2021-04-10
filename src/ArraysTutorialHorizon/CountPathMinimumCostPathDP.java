package ArraysTutorialHorizon;

public class CountPathMinimumCostPathDP {

    public static void main(String[] args) {

        int[][] A = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
                { 2, 9, 8, 2 } };
        CountPathMinimumCostPathDP c = new CountPathMinimumCostPathDP();
        int mincost = c.getCost(A);
        System.out.println("Min cost is "+mincost);
    }

    public int getCost(int a[][]){

        int solution [][]=new int[a.length][a.length];
        solution[0][0]=a[0][0];

        //fill row
        for(int i=1;i<a.length;i++){
            solution[0][i]=a[0][i]+solution[0][i-1];
        }

        //fill column
        for(int i=1;i<a.length;i++){
            solution[i][0]=a[i][0]+solution[i-1][0];
        }

        for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length;j++)
            {
                solution[i][j] = a[i][j]+Math.min(solution[i][j-1], solution[i-1][j]);
            }
        }
        return solution[a.length-1][a.length-1];

    }

}
