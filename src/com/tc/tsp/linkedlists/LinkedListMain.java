package com.tc.tsp.linkedlists;

public class LinkedListMain {

    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "LinkedListMain{" +
                "head=" + head +
                '}';
    }

    public void addInFront(Node n) {
        n.next=head;
        head=n;
    }

    public void printNodes() {
        Node n = head;
        System.out.print("Head->");
        while(n!=null) {
            System.out.print(n.data +"->");
            n=n.next;
        }
        System.out.println("null");
    }

    public void deleteFromFirst() {
        Node curr = head;
        head = curr.next;
        curr.next = null;
    }

    public void insertMiddle(Node prev, Node insert) {
        Node curr = prev;
        if(head==null){
            insert = head;
        } else {
            insert.next = prev.next;
            prev.next = insert;
        }
    }

    public void insertAtEnd(Node end){
        if(head == null) {
            head = end;
            end.next = null;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }

    public void deleteFromMiddle(Node deleteNode) {
        if(deleteNode == head) {
            head = deleteNode.next;
            deleteNode.next = null;
        } else {
            Node n = head;
            Node prev = null;
            while (n != null) {
                if (n.next == deleteNode) {
                    prev = n;
                }
                n = n.next;
            }
            prev.next = deleteNode.next;
            deleteNode.next = null;
        }
    }

    public void reverseLinkedList() {
        Node curr = head;
        Node next = null;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
