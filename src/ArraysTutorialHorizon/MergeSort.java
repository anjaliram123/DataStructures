package ArraysTutorialHorizon;

import java.util.Arrays;

public class MergeSort {

    //This doesn't work
    public static void main(String[] args) {
        int [] a = {12,11,13,5,6,7};
        MergeSort m = new MergeSort();
        int l = 0;
        int r = a.length-1;
        m.sort(l, r, a);
        m.printArray(a);
    }

    public void sort(int l, int r, int[]a){
       if(l<r){
           int mid = (l+r)/2;

           sort(l,mid,a);
           sort(mid+1,r,a);

           merge(l,mid,r,a);
       }
    }

    public void merge(int left, int mid, int right, int []a){
        //get size of subarrays
        int n1 = mid-left+1;
        int n2 = right-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=a[left+i];
        }

        for(int j=0;j<n2;j++){
            R[j]=a[mid+1+j];
        }

        int i = left, j = right;
        int k =left;

        while(i<n1 && j<n2) {
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }else{
                a[k]=R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements if any
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }

    public void printArray(int a[]){
        System.out.print(Arrays.toString(a));
    }
}
