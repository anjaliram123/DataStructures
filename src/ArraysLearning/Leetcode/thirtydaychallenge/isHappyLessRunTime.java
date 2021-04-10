package ArraysLearning.Leetcode.thirtydaychallenge;

public class isHappyLessRunTime {

    public static void main(String[] args) {
        isHappyLessRunTime is = new isHappyLessRunTime();
        boolean res = is.isHappy(6);
        System.out.println(res);
    }

    public boolean isHappy(int n) {
        int rem =0;
        int sumsq = 0;
        while(n!=0) {
            rem = n%10;
            sumsq += rem*rem;
            n=n/10;
        }
        if(sumsq == 1)
            return true;
        else if(sumsq>1 && sumsq<5)
            return false;
        else
            return isHappy(sumsq);
    }
}
