package stacks;

public class QueueUsingStackMain {

    public static void main(String[] args) {
        QueueUsingStackMain qm = new QueueUsingStackMain();
        QueueUsingStack q = new QueueUsingStack();
        q.push(1);
        q.push(2);
        int val = q.peek();
        System.out.println(val);
    }
}
