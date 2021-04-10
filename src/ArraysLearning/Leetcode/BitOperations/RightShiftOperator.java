package ArraysLearning.Leetcode.BitOperations;

public class RightShiftOperator {

    public static void main(String[] args) {

        RightShiftOperator r = new RightShiftOperator();
        int s = r.repeatArthimeticRightShift(-93242, 40);
        System.out.println(s);
        int l = r.repeatLogicRightShift(-93242, 40);
        System.out.println(l);

    }

    int repeatArthimeticRightShift(int x , int count) {
        for(int i=0;i<count ;i++) {
            x >>= 1;
        }
        return x;
    }

    int repeatLogicRightShift(int x , int count) {
        for(int i=0;i<count ;i++) {
            x >>>= 1;
        }
        return x;
    }
}
