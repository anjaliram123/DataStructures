package ArraysTutorialHorizon;

public class CountPathsfromtopLefttoBottomRightRecursion {

    public static void main(String[] args) {
        CountPathsfromtopLefttoBottomRightRecursion rec = new CountPathsfromtopLefttoBottomRightRecursion();
        int arr[][] ={{1,1,1},{1,1,1},{1,1,1}};
        int count = rec.count(arr, 0, 0);
        System.out.println(count);
    }

    public int count(int[][]a, int row, int column) {

        //base case to check if you are at bottom
        if(row==a.length-1 || column==a.length-1){
            return 1;
        }

        return (count(a,row,column+1) + count(a,row+1,column));
    }
}
