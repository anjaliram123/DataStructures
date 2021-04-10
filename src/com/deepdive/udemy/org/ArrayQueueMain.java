package com.deepdive.udemy.org;

public class ArrayQueueMain {


    public static void main(String[] args) {


        ArrayQueue ar = new ArrayQueue(5);
        ar.Enqueue(23);
        ar.Enqueue(34);
        ar.Enqueue(12);
        ar.Enqueue(4);
        ar.Enqueue(43);
        System.out.println(ar.FrontItem());
        //ar.Enqueue(56);
       // System.out.println(ar.FrontItem());
        System.out.println(ar.isEmpty());
        ar.printqueue();
        System.out.println("--------------------------------------");
        ar.dequeue();
        ar.dequeue();
        ar.dequeue();
        ar.dequeue();
        ar.dequeue();
        ar.printqueue();
        System.out.println("----------------------------------------");
        ar.Enqueue(110);
        ar.printqueue();

    }
}
