package PracticeLinkedlists;

public class Main {

    public static void main(String[] args) {

        Linkedlists l1=new Linkedlists();
        l1.head=new Node(1);
       // l1.printelements();
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
       // Node n6=new Node(32);
        l1.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
       // n5.next=n6;
        System.out.println("-------------------");
        l1.printelements(l1.head);
//        l1.printelements();
//        System.out.println("-------------------");
//        l1.getFirst();
//        l1.removefirst();
//        System.out.println("--------------");
//        l1.printelements();
//        l1.addatLast(43);
//        System.out.println("--------------------");
//        l1.printelements();
//        System.out.println("--------------------");
//        l1.getlast();
//        System.out.println(l1.ifcontains(43));
//       // l1.getAtposition(2);
//        System.out.println(l1.getlength());
//        System.out.println("Getting node at position ");
//        System.out.println(l1.getAtposition(1));
//        System.out.println("Inserting After a particular node----------------");
//        l1.InsertAfter(n2,31);
//        l1.printelements();
//       // System.out.println("Inserting before a particular node------------");
//       // l1.InsertBefore(n3,4);
//       // l1.printelements();
//        l1.printelements(l1.head);
     //  System.out.println("Reversing an element");
//        Node head=l1.Reverse(l1.head);
//        l1.printelements(head);
//       Node head=l1.ReverseElements(l1.head);
 //     l1.printelements(head);
     // System.out.println("Insert before a Node-------------");
       // l1.InsertBefore(n2,1);
        //l1.printelements(l1.head);
//        System.out.println("Find middle of a given linked list");
//        int middle=l1.findmiddle(l1.head);
 //       System.out.println(middle);
//        System.out.println("Deleting a node-------------------");
//        l1.deletenode(n3);
//        l1.printelements(l1.head);
        System.out.println("-----------------------------------------");
        l1.lengthoflinkedlist(l1.head);
        System.out.println("Reverse a linked list from m to n---------------------");
        Node head=l1.reversefromM2N(l1.head,2,4);
        l1.printelements(head);







    }
}
