package ArraysLearning.Leetcode.thirtydaychallenge;

public class MinStackmain {

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(45);
        m.push(46);
        m.push(23);
        m.push(89);
        m.push(2);
        m.push(41);
        m.print();

        System.out.println("---------------------------------------");
        m.pop();
        System.out.println(m.getMin());
    }
}
