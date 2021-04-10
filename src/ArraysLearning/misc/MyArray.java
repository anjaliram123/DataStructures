package ArraysLearning.misc;

public class MyArray {

    public static void main(String[] args) {

        String[]arr = new String[5];

        arr[0]="rome";
        arr[1]="italy";

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int[] ar = {12,23,45,67};
        System.out.println("Add a new elment 43 to array");

        int [] ar1= new int[5];
        for(int i=0;i<ar.length;i++)
        {

            ar1[i]=ar[i];
            System.out.println(ar1[i]);
        }







    }
}
