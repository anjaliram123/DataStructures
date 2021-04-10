package ArraysTutorialHorizon.Sorting;

public class ShellSort {

    //Shellsort uses a gap value, in insertion sort we compare adjacent elements but in shell sort
    //it creates a gap value which is higher than one and compares those two elements
    //so that the shifting of psotions will reduce
    //at final step the gap becomes '1' and it results in an insertion sort, but by that time
    //array will almost be sorted
    //Knuth sequence - (3^k-1)/2
    //Shell sort is an unstable alogrithm, because since we use a gap here and swap elements
    //based on gap, it might sometime happen that we
    public static void main(String[] args) {
        ShellSort s = new ShellSort();
        int a [] = {13,21,34,56,9,10,4,5,78,99,32,32}; //same elements require 28 swaps in insertion sort,(15 here)
        s.sort(a);
    }

    public void sort(int a[]) {
        int swap = 0;
        for(int gap=a.length/2 ; gap>0 ;gap=gap/2){
            for(int j=gap; j<a.length;j++){
                int i = j-gap;
                int key = a[j];
                while(i>=0 && a[i]>key) {
                    a[i+gap] = a[i];
                    i = i-gap;
                    a[i+gap] = key;
                    swap = swap+1;
                }
            }
        }

        for(int i=0;i<a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("No.of swaps " +swap);
    }
}
