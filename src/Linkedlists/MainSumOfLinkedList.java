package Linkedlists;

import RemoveduplicatesfromLinkedlist.SingleLinkedlist;

import java.util.ArrayList;
import java.util.List;

public class MainSumOfLinkedList {

    public static void main(String[] args) {

        SumofLinkedList l = new SumofLinkedList();
        SumofLinkedList l1 = new SumofLinkedList();
        Node n3 = new Node(6,null);
        Node n2 = new Node(1,n3);
        l1.head = new Node(7,n2);

        SumofLinkedList l2 = new SumofLinkedList();
        Node n6 = new Node(2,null);
        Node n5 = new Node(9,n6);
        l2.head = new Node(5,n5);

        l1.printNodes();
        System.out.println("============================================================");
        l2.printNodes();

        int sum1 = l1.addNodes();
        int sum2 = l2.addNodes();
        int Totalsum = sum1+sum2;
        System.out.println("Total sum is "+(Totalsum));
        List<Integer> li = l.getNumbersFromsum(Totalsum);
        SingleLinkedlist l3 = new SingleLinkedlist();











    }

}
