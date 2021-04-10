package ArraysTutorialHorizon.Sorting;

//Bubble sort is stable sort, because we compare adjacent elemnts and only swap if element
//is greater than other (stbale means there are two 13's here there relative postioning is not changing
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int a[] = {13,21,34,56,9,10,13};
//        int a [] = new int[100];
//        int k = 1;
//        for(int l=a.length-1; l>=0 ; l--){
//            a[l]=k;
//            k++;
//        }
        a = bs.sort(a);
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int[] sort(int a[]) {
        int swap = 0;
        boolean isswapped = false;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = swap + 1;
                    isswapped = true;
                }
            }
            if(!isswapped){
                break;
            }
        }
        System.out.println("No.of swaps " +swap);
        return a;
    }

    //For best case (if array is already sorted it takes o(n) times
    //because it only go through all n elements and does no swaps
    //In oreder to improvise this algorithm, we break out of the loop
    //if there is no swap when i=0 completed, it means Arrays is sorted.

}
