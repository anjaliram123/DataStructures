package com.add.two.linked.lists;

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

    public Node addlists(Node head1, Node head2) {

        Node curr1 = head1;
        Node curr2 = head2;
        LinkedList l3 = new LinkedList();
        Node n3 = new Node(1);
        l3.head = n3;
        int carryForward = 0;
        while(curr1!=null && curr2!=null) {
            int result = 0;
            result = curr1.val+curr2.val;
            if(result>=10){
                result = result%10;
                carryForward = carryForward+result%10;
            } else {
                carryForward =carryForward +result/10;
            }
            n3.next = new Node(carryForward+result);
            curr1=curr1.next;
            curr2=curr2.next;
            n3 = n3.next;
        }
        return l3.head.next;
    }
}
