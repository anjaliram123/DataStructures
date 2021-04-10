package ArrayTechniques;

import java.util.Scanner;

public class InsertAndRemovefromArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements to be inserted in Array");
        int end =-1;
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
            end++;
           // System.out.println(a[i]);

        }
        print(a);
        System.out.println("The end of element is"+end);


        System.out.println("Enter the element to be removed from Array");
        int removeelement=s.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==removeelement)
            {
                System.out.println("The element is at index"+" "+i);
               // while()


            }

        }
        print(a);





    }

    public static void print(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
