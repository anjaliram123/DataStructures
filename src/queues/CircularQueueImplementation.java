package queues;

public class CircularQueueImplementation {

    //The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".

   // One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.


   private int queue[];
   private  int headIndex;
   private int currSize;
   private int totalCapacity;

    public CircularQueueImplementation(int k) {
        this.totalCapacity = k;
        this.currSize = 0;
        this.headIndex = 0;
        this.queue = new int[k];
    }

    public boolean enQueue(int val) {
        if(this.currSize == this.totalCapacity) {
            return false;
        }
        int tailIndex = (this.headIndex+this.currSize) %  this.totalCapacity;
        this.queue[tailIndex] = val;
        this.currSize += 1;
        return true;
    }

    public boolean deQueue() {
        if(this.currSize == 0) {
            return false;
        }
        this.headIndex = (this.headIndex+1)%this.totalCapacity;
        this.currSize -= 1;
        return true;
    }

    public int Front() {
        if(this.currSize == 0) {
            return -1;
        }
        return this.queue[this.headIndex];
    }

    public int Rear() {
        if(this.currSize == 0) {
            return -1;
        }
        int tailIndex = (this.headIndex+this.currSize-1)%this.totalCapacity;
        return queue[tailIndex];
    }

    public boolean isEmpty() {
        if(this.currSize == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(this.currSize == this.totalCapacity) {
            return true;
        }
        return false;
    }
}
