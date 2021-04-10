package ArraysTutorialHorizon;

import java.util.Arrays;

public class MergeTwoSortedArraysAndFindMedian {
    public static void main(String[] args) {
        int a[] = {2,6,9,10};
        int b[] = {1,5,7};
        MergeTwoSortedArraysAndFindMedian m = new MergeTwoSortedArraysAndFindMedian();
        double median = m.getMedian(a,b);
        System.out.println("Median is "+median);
    }

    public double getMedian(int []a, int[]b){
        //Merge two arrays of same size
        int c[]=new int[a.length+b.length];
        int n = a.length;
        int m = b.length;
        int i=0;int k=0;int j=0;
        while(i<n && j<m){
            if(a[i] < b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n){
            c[k]=a[i];
            i++;
            k++;
        }

        while(j<m){
            c[k]=a[m];
            j++;k++;
        }

        int start = 0;
        int end = c.length-1;
        int size = end-start+1;
        double median = 0;
        if(size%2==0){
            float x = c[start+(size/2)];
            float y = c[start+(size-1)/2];
            median = (x+y)/2;
        }else{
         median = c[start+(size-1)/2];
        }
       return median;
    }
}
