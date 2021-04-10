package com.odd.even.linked.list;

public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        l1.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        Node result = l1.oddevenlist(l1.head);
        l1.print(result);
    }
}
