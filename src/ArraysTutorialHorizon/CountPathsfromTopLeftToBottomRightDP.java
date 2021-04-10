package ArraysTutorialHorizon;

public class CountPathsfromTopLeftToBottomRightDP {

    public static void main(String[] args) {
        CountPathsfromTopLeftToBottomRightDP dp = new CountPathsfromTopLeftToBottomRightDP();
        int arr[][] ={{1,2,1,2},{7,7,2,5,},{6,4,3,4},{1,2,2,5}};
        int count = dp.count(arr, 0, 0);
        System.out.println(count);
    }
    public int count(int[][]a, int row, int column) {
        int solution[][]=new int[a.length][a.length];
        solution[0][0]=1;// 1 path to reach (0,0)

        //no.of ways to reach any cell in first row
        for(int i=0;i<a.length;i++){
            solution[0][i]=1;
        }

        for(int i=0;i<a.length;i++){
            solution[i][0]=1;
        }

        for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length;j++) {
                solution[i][j]=solution[i-1][j]+solution[i][j-1];
            }
        }

       return solution[a.length-1][a.length-1];
    }

}
