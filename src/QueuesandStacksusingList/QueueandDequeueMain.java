package QueuesandStacksusingList;

public class QueueandDequeueMain {


    public static void main(String[] args) {

        QueueandDequeue q = new QueueandDequeue();
        q.Enqueue(5);
        q.Enqueue(3);

        System.out.println(q.Front());
        q.Dequeue();
        System.out.println(q.Front());
        q.Dequeue();




    }
}
