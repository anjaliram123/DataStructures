package com.deepdive.udemy.org;

import java.util.NoSuchElementException;

public class ArrayQueue {

    public int a[];
    public int head;
    public int tail;
    public int size;


    public ArrayQueue(int capacity)
    {
        a=new int[capacity];
        head=0;
        tail=0;
    }

    public boolean Enqueue(int value)
    {

        if(tail==a.length)
        {
            int b[]=new int[a.length*2];
            System.arraycopy(a,0,b,0,a.length);
            a=b;
        }

        a[tail]=value;
        tail=tail+1;
        size++;//since size=tail-head size should increase everytime a new element is added.

        return true;

    }


    public boolean dequeue()
    {
        if(size()==0)
        {
           throw new NoSuchElementException();
        }
         if(head==tail)
         {
             head=0;
             tail=0;

             return true;
         }
         head=head+1;
        if(size()==0)
        {
            head=0;tail=0;    //re-setting the queue if queue is empty
        }
         return true;
         }


         public boolean isEmpty()
         {
             if(size()==0)
             {
                 return true;
             }
             else
             {
                 return false;
             }
         }


         public int FrontItem()
         {

             if(size()==0)
             {
                 return -1;
             }
             return a[head];
         }



         public int size()
         {
             return tail-head;
         }
         public void printqueue()
         {
             for(int i=head;i<tail;i++)

             {
                 System.out.println(a[i]);
             }
         }


}
