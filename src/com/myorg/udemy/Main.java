package com.myorg.udemy;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a[] = new int[5];
        a[0]=34;
        a[1]=-23;
        a[2]=4;
        a[3]=67;
        a[4]=78;

        for(int i=0;i<a.length;i++)
        {
           if(a[i]==4)
           {
               System.out.println(i);
           }
        }
    }
}
