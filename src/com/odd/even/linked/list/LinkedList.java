package com.odd.even.linked.list;

public class LinkedList {

    public Node head;


    public void print(Node head) {
        Node curr = head;
        System.out.print("Head->");
        while(curr!=null) {
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public Node oddevenlist(Node head) {
        Node curr = head;
        Node evennodes = evenlist(head);
        Node prev = new Node(-1);
        int i=1;
        while(curr!=null) {
            if (i % 2 != 0) {
                prev = curr;
                curr = curr.next;
            }
           else if(i%2 == 0) {
                prev.next = curr.next;
                curr = curr.next;
            }
           i++;
        }

        Node curr2 = head;
        while(curr2.next!=null) {
            curr2 = curr2.next;
        }
        curr2.next = evennodes;

        return evennodes;
    }

    public Node evenlist(Node head) {
        Node curr = head;
        Node evennode = new Node(-1);
        Node prev = evennode;
        int i=1;
        while(curr!=null) {
            if (i % 2 == 0) {
                prev = curr;
                curr = curr.next;
            }
            else if(i%2 != 0) {
                prev.next = curr.next;
                curr = curr.next;
            }
            i++;
        }
        return head;
    }


}
