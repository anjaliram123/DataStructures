package com.reverse.linkedlist.m.to.n;

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

//    public void removeVal(Node head, int val) {
//        if(head == null) {
//
//        }
//        Node fakeHead = new Node(-1);
//        fakeHead.next = head;
//        Node curr = head;
//        Node prev = fakeHead;
//        while(curr!=null) {
//            if(curr.val == val) {
//                prev.next = curr.next;
//            }
//            else {
//                prev = prev.next;
//            }
//            curr = curr.next;
//        }
//    }
//
//    public Node getMiddle(Node head) {
//        Node curr = head;
//        int len = 0;
//        while(curr!=null) {
//            len++;
//            curr=curr.next;
//        }
//
//        int middlelen = len/2;
//        Node now = head;
//        while(middlelen > 0) {
//            now = now.next;
//            middlelen--;
//        }
//        return now;
//    }
//
//    public void deleteNthElement(Node head, int n) {
//        Node curr = head;
//        Node prev = curr;
//        int i = 0;
//        if(n==0) {
//            head = curr.next;
//        }
//        while(curr!=null) {
//            if(i==n) {
//                prev.next = curr.next;
//            } else {
//                prev = curr;
//            }
//            curr=curr.next;
//            i++;
//        }
//    }

    public Node reverseFromMtoN(Node head, int m, int n) {
        Node curr = head;
        Node c = head;
        int i=1;
        int j=1;
        int length =1;
        while(curr.next!=null) {
            length++;
            curr = curr.next;

        }
        if(m>length || n>length) {
            return null;
        }
        Node reverseStart = null;
        Node reverseEnd = null;
        while(c!=null) {
            if(i==m) {
                reverseStart = c;
            }

            if(j==n) {
                reverseEnd = c;
            }
            c = c.next;
            i++;
            j++;
        }

        Node reverse = reverse(reverseStart, reverseEnd);
        return reverse;
    }

    private Node reverse(Node start, Node end) {
        Node curr = start;
        Node next = null;
        Node prev = null;
        while(curr!=null){
            if(curr.val == end.val) {
                curr.next = null;
            }
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
