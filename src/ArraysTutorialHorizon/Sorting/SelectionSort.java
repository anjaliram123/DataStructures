package ArraysTutorialHorizon.Sorting;

//Selection sort is stable sort
//because it checks for min value and the first min(13) is sorted, the second min(13) is kept after it
public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int a[] = {56,34,21,13,10,9,13};
        //9,34,21,13,10,56,13
        //9,10,21,13,34,56,13
        //9,10,13,21,34,56,13
        //9,10,13,13,21,34,56

//        int a [] = new int[300000];
//        int k = 1;
//        for(int l=a.length-1; l>=0 ; l--){
//            a[l]=k;
//            k++;
//        }
        a = ss.sort(a);
      // for(int i=0; i<a.length;i++) {
       //    System.out.println(a[i]);
      // }

    }

    public int[] sort(int a[]){
        int swap= 0;
        long start = System.currentTimeMillis();
        System.out.println("Start time now " +start);
        for(int i=0;i<a.length-1;i++) {
            int min = i;
            for(int j=i+1; j<=a.length-1; j++){
                if(a[j] < a[min]){
                   min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i]=temp;
            swap = swap+1;
        }
        long end = System.currentTimeMillis();
        System.out.println("End time now " +end);
        System.out.println("No.of swaps " +swap);
        return a;
    }
    //for best case it takes o(n^2) because it does swap all
    //elements even though its sorted.
}
