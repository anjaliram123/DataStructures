package com.myorg.udemy;

public class MergeSort {

    public static void main(String[] args) {

        int a[]={90,45,1,6,-34,-23};




        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }


    public static void mergesorting(int a[],int start,int end)
    {
        if(end-start < 2)
        {
            return;
        }
        int mid=(end-start)/2;
        mergesorting(a,start,mid);
        mergesorting(a,mid+1,end);
        merge(a,start,mid,end);
    }
//we are always merging sorted arrays
    //{90,45,1,6,-34,-23}
    public static void merge(int a[],int start,int mid,int end)
    {

        //if(a[])

    }
}
