package SortingTechniques;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {20, 35, -15, 7, 55, 1, -22};

        for(int j=1;j<a.length;j++){
            int i = j-1;
            int key = a[j];
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i=i-1;
                a[i+1]=key;
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}
