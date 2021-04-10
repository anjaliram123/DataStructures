package SortingTechniques;

public class DivideAndConquer {

    private static int num = 0;
    public static void main(String[] args) {
        int [] ar = {12,11,13,5,6,7,2,4,1};
        DivideAndConquer dc = new DivideAndConquer();
        dc.sort(ar,0,ar.length-1);
        System.out.println("Sorted array");
        for(int i=0;i<ar.length;++i) {
            System.out.println(ar[i]);
        }
        System.out.println(num);

    }

    private void merge (int ar[] , int start ,int middle,  int end) {
        num++;
        int i=start ; int j=middle + 1;
        int k = 0;
        int temp [] = new int[end-start+1];
        while(i<=middle && j<=end) {
            if(ar[i] <= ar[j]) {
                temp[k] = ar[i];
                i++;
            } else {
                temp[k] = ar[j];
                j++;
            }
            k++;
        }

        while(i<= middle) {
            temp[k] = ar[i];
            i++;
            k++;
        }

        while(j<=end) {
            temp[k] = ar[j];
            j++;
            k++;
        }

        for(i = start; i <= end; i += 1) {
            ar[i] = temp[i - start];
        }

    }

    private void sort(int ar[], int left, int right) {
        if(left<right) {
            int middle = (left+right)/2;

            sort(ar, left, middle);
            sort(ar,middle+1, right);

            merge(ar, left, middle, right);
        }
    }







}
