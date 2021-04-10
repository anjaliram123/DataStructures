package stacks;

public class DesignaStackWithIncrementOperation {

    public static void main(String[] args) {
        CustomStack ct = new CustomStack(2);
        ct.push(34);
        System.out.println(ct.pop());
        ct.increment(8, 100);
        System.out.println(ct.pop());
        ct.increment(9, 91);
        ct.push(63);
        System.out.println(ct.pop());
        ct.push(84);
        ct.increment(10, 93);
        ct.increment(6, 45);
        ct.increment(10, 4);

    }
}
