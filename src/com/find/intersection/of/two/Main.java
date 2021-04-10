package com.find.intersection.of.two;

public class Main {

    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.head = new Node(4);
        Node n2 = new Node(1);
        Node n3 = new Node(8);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        L1.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedList L2 = new LinkedList();
        L2.head = new Node(5);
        Node nn = new Node(0);
        L2.head.next = nn;
        Node nm = new Node(1);
        nn.next = nm;
        nm.next = n3;
        n3.next = n4;
        n4.next = n5;


      // Node result =  L1.intersectionOfNodesofEqualLengthLists(L1.head, L2.head);
      // System.out.println(result.data);
       Node result2 = L1.intersectionOfNodesofunEqualLengthLists(L1.head, L2.head);
        System.out.println(result2.data);



    }
}
