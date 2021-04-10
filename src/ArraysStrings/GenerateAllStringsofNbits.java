package ArraysStrings;

import java.util.Arrays;

public class GenerateAllStringsofNbits {

    static int n =3;
    static int arr[] = new int[n];

    public static void main(String[] args) {
        GenerateAllStringsofNbits g = new GenerateAllStringsofNbits();
        g.generate(n);
    }

    public void generate(int n) {

        if(n<=0) {
            System.out.println(Arrays.toString(arr));
        }
        else{
            arr[n-1] = 0;
            generate(n-1);
            arr[n-1] = 1;
            generate(n-1);
        }
    }
}
