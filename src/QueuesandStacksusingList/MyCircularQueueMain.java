package QueuesandStacksusingList;

public class MyCircularQueueMain {


    public static void main(String[] args) {

        MyCircularQueue mq = new MyCircularQueue(4);
        mq.enQueue(5);
       // System.out.println(mq.Front());
        mq.enQueue(3);
        mq.enQueue(43);
        mq.enQueue(31);
        System.out.println(mq.Front());
        System.out.println(mq.Rear());
      //  System.out.println(mq.isEmpty());
      //  System.out.println(mq.isFull());
        if(mq.isEmpty()==false)
        {
            mq.deQueue();
        }
       System.out.println(mq.Front());
        if(mq.isEmpty()==false)
        {
            mq.deQueue();
        }
        System.out.println(mq.Front());
        System.out.println(mq.Rear());
        mq.enQueue(56);
        System.out.println(mq.Front());





    }
}
