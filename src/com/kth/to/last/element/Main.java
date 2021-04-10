package com.kth.to.last.element;
import com.kth.to.last.element.Node;
import com.kth.to.last.element.LinkedList;



public class Main {

    public static void main(String[] args) {

        LinkedList L1 = new LinkedList();
        L1.head = new Node(4);
        Node n2 = new Node(1);
        Node n3 = new Node(8);
        Node n4 = new Node(3);
        Node n5 = new Node(5);

        L1.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        L1.print(L1.head);
        System.out.println("---------------------------------------");
        Node result = L1.kthtoLastElement(L1.head,2);
        //Node result = L1.nthfromLast(L1.head, 2);
        L1.print(result);
    }


}
