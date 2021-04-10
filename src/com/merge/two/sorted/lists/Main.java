package com.merge.two.sorted.lists;

import com.remove.given.value.linkedlist.LinkedList;
import com.remove.given.value.linkedlist.Node;

public class Main {

    public static void main(String[] args) {

        com.merge.two.sorted.lists.LinkedList l = new com.merge.two.sorted.lists.LinkedList();
        l.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);

        com.merge.two.sorted.lists.LinkedList l2 = new com.merge.two.sorted.lists.LinkedList();
        l2.head = new Node(1);
        Node n5 = new Node(3);
        Node n6 = new Node(4);

        l.head.next=n2;
        n2.next=n3;

        l2.head.next=n5;
        n5.next=n6;

        l.print(l.head);
        l.print(l2.head);
        Node n = l.mergeSortedLists(l.head, l2.head);
        l.print(n);


    }
}
