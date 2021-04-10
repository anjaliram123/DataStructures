package com.tc.tsp.linkedlists;

public class Main {

    public static void main(String[] args) {

        Node n1 = new Node("pumpkin");
        Node n2 = new Node("berries");
        Node n3 = new Node("cherries");
        Node n4 = new Node("Awww");
        LinkedListMain li = new LinkedListMain();
        li.addInFront(n1);
        li.addInFront(n2);
        li.addInFront(n3);

        li.printNodes();
        li.deleteFromFirst();
        li.printNodes();
        li.insertMiddle(n2,new Node("bum"));
        li.printNodes();
        li.insertAtEnd(new Node("sugar"));
        li.printNodes();
       // li.insertMiddle(n3,n4);
        li.printNodes();
        li.deleteFromMiddle(n1);
        li.printNodes();
        li.reverseLinkedList();
        li.printNodes();
    }
}
