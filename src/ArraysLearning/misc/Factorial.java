package ArraysLearning.misc;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = s.nextInt();
        int fact=1;
        fact=factorial(n);
        System.out.println(fact);
        }

        public static int factorial(int n)
        {
           if(n==0)
            {
                return 1;
            }
            else
            return (n*factorial(n-1));
        }
}
