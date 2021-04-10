package com.find.intersection.of.two;

public class LinkedList {

    Node head;


    public Node intersectionOfNodesofEqualLengthLists(Node head1, Node head2) {
        Node result = null;
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            } else {
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return result;
    }

    public Node intersectionOfNodesofunEqualLengthLists(Node head1, Node head2) {

        int length1 = length(head1);
        int length2 = length(head2);

        while(length1>length2) {
            head1 = head1.next;
            length1--;
        }

        while(length2>length1) {
            head2 = head2.next;
            length2--;
        }

        while(head1!=head2) {
            head1=head1.next;
            head2=head2.next;
        }
        return head1;
    }

    private int length(Node head) {
        int length = 0;
        Node curr = head;
        while(curr!=null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
}
