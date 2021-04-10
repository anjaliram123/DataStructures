package ArraysTutorialHorizon;

public class DiagonalsOfMatrix {

    public static void main(String[] args) {
        int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DiagonalsOfMatrix d = new DiagonalsOfMatrix();
        d.print(a);
    }

    public void print(int a[][]){

        int row = 0;
        int col;

        //first half
        while(row<a.length){
            col = 0;
            int rowtemp = row;
            while(rowtemp>=0){
                System.out.print(a[rowtemp][col]+" ");
                col++;
                rowtemp--;
            }
            System.out.println();
          row++;
        }

        //second half
        col = 1;
        while(col<a.length){
            int colTemp = col;
            row = a.length-1;
            while(colTemp<=a.length-1){
                System.out.print(a[row][colTemp]+" ");
                row--;
                colTemp++;
            }
            System.out.println();
            col++;
        }


    }
}
