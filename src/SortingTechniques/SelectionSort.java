package SortingTechniques;

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = {20, 35, -15, 7, 55, 1, -22};


        for (int j = a.length - 1; j >0; j--) {
            int max = 0;
            int temp = 0;
            int maxIndex = 0;
            for (int i = 1; i <=a.length-1; i++) {
                if (a[i] > a[max]) {
                    max = i;
                }
            }
                swap(a,max,a.length-1);
            }//Big o is O(n^2) it is a unstable Algorthim

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

    public static void swap(int a[],int b,int c){
          if(b==c){
              return;
          }
          int temp=a[b];
          a[b]=a[c];
          a[c]=temp;
    }
}

