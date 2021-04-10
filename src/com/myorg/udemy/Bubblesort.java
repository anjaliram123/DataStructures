package com.myorg.udemy;

public class Bubblesort {

    public static void main(String[] args) {

     int a[] = {20,35,-15,7,55,1,-22};
        for(int lastunsorted=a.length-1;lastunsorted>0;lastunsorted--)
        {
            for(int i=0;i<lastunsorted;i++)
            {
                if(a[i]>a[i+1])
                {
                    swap(a,i,i+1);
                }
            }


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
