package com.kth.to.last.element;

public class LinkedList {

    Node head;

    public void print(Node head) {
        Node curr = head;
        if(curr == null) {
            System.out.println("null");
        }
        System.out.print("Head->");
        while(curr!=null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public Node kthtoLastElement(Node head, int n) {
        int i=0;
        Node curr = head;
        Node result =  null;
        if(n==0) {
            return curr;
        }
        while(curr!=null) {
            curr = curr.next;
            i++;
            if(i==n) {
                result = curr;
            }
            if(n>i) {
                result = null;
            }
        }
        return result;
    }


}
