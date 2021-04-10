package com.myorg.udemy;

public class Selectionsort {


    public static void main(String[] args) {

        int a[]={20,35,-15,7,55,1,-22};

        for(int lastunsorted=a.length-1;lastunsorted>0;lastunsorted--)
        {
                int largest=0;
            for(int i=1;i<=lastunsorted;i++)
            {
             if(a[i]>a[largest])
             {
                 largest=i;
             }
            }

            swap(a,largest,lastunsorted);
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }



    }

    public static void swap(int a[],int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=0;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
