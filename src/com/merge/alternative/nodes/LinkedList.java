package com.merge.alternative.nodes;

import com.remove.given.value.linkedlist.Node;

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

    public Node mergeSortedLists(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;

        Node curr3 = new Node(-1);
        Node returnNode = curr3;
        if ((curr1 == null) && (curr2 == null)) {
            return null;
        }
        while((curr1!=null) && (curr2!=null)) {
            if(curr1.val <= curr2.val) {
                curr3.next = curr1;
                curr1 = curr1.next;
            }
            else {
                curr3.next = curr2;
                curr2 = curr2.next;
            }
            curr3 = curr3.next;
        }
        if(curr1 == null) {
            curr3.next = curr2;
        }else if(curr2 == null) {
            curr3.next = curr1;
        }
        return returnNode.next;
    }

    public Node mergealternative(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        Node returnval = null;
        while(curr1!=null && curr2!=null) {
            Node next1 = curr1.next;
            Node next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;

            if(curr1==null && curr2!=null) {
                next2 = curr2;
                curr2.next = null;
                returnval = next2;
                return returnval;
            }

            if(curr1!=null && curr2==null) {
                next1 = curr1;
                curr1.next = null;
                returnval = next1;
                return null;
            }
        }
        return returnval;
    }
}
