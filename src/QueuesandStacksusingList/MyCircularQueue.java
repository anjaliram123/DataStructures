package QueuesandStacksusingList;

public class MyCircularQueue {


    int a[];
    int head;
    int tail;
    public MyCircularQueue(int k) {

        a=new int[k];
        head=-1;
        tail=-1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {


        if(tail==a.length) {
            return false;
        }

        head=0;
        tail=tail+1;
        a[tail]=value;
        return true;

    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        if(isEmpty()==true)
        {
            return false;
        }

        if(head==tail)
        {
            head=-1;
            tail=-1;
            return true;
        }

        head=head+1;
        return true;

        }

    /** Get the front item from the queue. */
    public int Front() {


        if(isEmpty()==true)
        {
            return -1;
        }

        return a[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {

        if(isEmpty()==true)
        {
            return -1;
        }
          return a[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {

        if (head==-1 && tail==-1) {
            return true;
        }
        return false;

    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(head==tail)
        {
            return true;
        }

        else
        {
            return false;
        }
}


}
