package com.merge.alternative.nodes;

import com.remove.given.value.linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.head = new Node(7);
        Node n2 = new Node(5);
        Node n3 = new Node(6);
        //Node n4 = new Node(34);

        LinkedList l2 = new LinkedList();
        l2.head = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(4);
        //Node n7 = new Node(12);

        l.head.next=n2;
        n2.next=n3;
        //n3.next = n4;

        l2.head.next=n5;
        n5.next=n6;
        //n6.next = n7;

        l.print(l.head);
        l.print(l2.head);
        Node n = l.mergealternative(l.head, l2.head);
        l.print(n);
        l.print(l.head);


    }
}
