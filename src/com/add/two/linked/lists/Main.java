package com.add.two.linked.lists;

public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.head = new Node(2);
        Node n1 = new Node(4);
        Node n2 = new Node(3);

        l1.head.next = n1;
        n1.next = n2;

        LinkedList l2 = new LinkedList();
        l2.head = new Node(5);
        Node n3 = new Node(6);
        Node n4 = new Node(4);
        l2.head.next = n3;
        n3.next = n4;

        Node result = l1.addlists(l1.head,l2.head);
        l1.print(result);
    }
}
