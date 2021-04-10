package queues;

public class QueueTest {

    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation();
        System.out.println(q.dequeue());
        q.enqueue("star");
        q.enqueue("of");
        System.out.println(q.dequeue());
    }
}
