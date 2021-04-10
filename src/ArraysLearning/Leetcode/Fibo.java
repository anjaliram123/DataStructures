package ArraysLearning.Leetcode;

public class Fibo {

    //given n print the nth fibonachi number
    //0,1,1,2,3,5,8,13,21,34
    public static void main(String[] args) {
        Fibo fib = new Fibo();
        int res = fib.fibo(6);
        System.out.println(res);
    }

    public int fibo(int n) {
        int a = 0; int b = 1;
        int c = 0;
        if(n == 0 ) {
            return 0;
        }
        if( n == 1) {
            return b;
        }
        for(int i=2; i<=n ; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
