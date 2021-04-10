package com.delete.nth.node.from.end;

public class Main {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

         head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        l.print(head);
       // Node reverseNode = l.reverseFromMtoN(head, 2,4 );
        //l.print(reverseNode);
        Node returnNode = l.deleteNthFromEnd(head,5);
        l.print(returnNode);

    }
}
