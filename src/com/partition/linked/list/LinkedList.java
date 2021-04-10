package com.partition.linked.list;

public class LinkedList {

    public Node head;

    public void print(Node head) {
        Node curr = head;
        System.out.print("Head->");
        while(curr!=null) {
            System.out.print(curr.val);
            System.out.print("->");
            curr= curr.next;
        }
        System.out.println("null");
    }

    public Node partition(Node head, int value) {
        Node firstPart = new Node(-1);
        Node curr = head;
        Node partition = new Node(value);

//        while(curr!=null) {
//            if(curr.val == value) {
//                partition = curr;
//            }
//            curr = curr.next;
//        }

        while(curr!=null) {
            if(curr.val < value) {
                firstPart.next = curr;
                firstPart = firstPart.next;
            } else if(curr.val >= value) {
                partition.next = curr;
                partition = partition.next;
            }
            curr = curr.next;
        }

        firstPart.next = partition;

        return firstPart;
    }

}
