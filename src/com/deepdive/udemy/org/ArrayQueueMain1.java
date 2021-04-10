package com.deepdive.udemy.org;

public class ArrayQueueMain1 {


    public static void main(String[] args) {
        ArrayQueue aa = new ArrayQueue(5);
        aa.Enqueue(50);
        aa.Enqueue(40);
        aa.dequeue();
        aa.Enqueue(30);
        aa.dequeue();
        aa.Enqueue(20);
        aa.dequeue();
        aa.Enqueue(10);
        aa.dequeue();
        aa.Enqueue(5);

        // here we are making sure that there will always be two element in the queue though capacity is 5
        // and when we add 2 elements,remove one and again add 1 the array length is increasing twice
        //instead of utilising already exisitng space, we have to change this.we have to make it
        //utilize already exisitng space.
        System.out.println(aa.a.length);
    }
}
