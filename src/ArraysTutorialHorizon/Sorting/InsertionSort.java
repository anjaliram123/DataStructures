package ArraysTutorialHorizon.Sorting;
//Elements only move only one position at a time in insertion sort which is a disadvantage and
//idea of shell sort is to move elements several positions at a time.
public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int a[] = {13,21,34,56,9,10,4,5,78,99,32,32};
        //13,34,9,10,13
        //9,13,34,10,13
        //9,10,13,34,13
        //9,10,13,13,34
        //This proves insertion sort is a stable algorithm
        //int a[] = {56,34,21,13,10,9};
//        int a [] = new int[300000];
//        int k = 1;
//        for(int l=a.length-1; l>=0 ; l--){
//            a[l]=k;
//            k++;
//        }
        i.sort(a);
    }

    public void sort(int a[]) {
        int swap = 0;
        int key;
        long start = System.currentTimeMillis();
        System.out.println("Start time now " +start);
        for(int j=1;j<a.length;j++){
            key = a[j];
            int i = j-1;
            while(i>=0 && a[i] > key){
                a[i+1] = a[i];
                i = i-1;
                a[i+1] = key;
                swap = swap + 1;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("End time now " +end);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        System.out.println("No.of swaps " +swap);
    }

    //Insertion sort is much more efficient than selection sort as
    //no.of swaps dunring best case is '0'

}
