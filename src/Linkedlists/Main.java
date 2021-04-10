package Linkedlists;

public class Main {

    public static void main(String[] args) {

        Linkedlist l1=new Linkedlist();
    //    l1.head=new Node(23);
  //      Node n2=new Node(54);
//        Node n3=new Node(75);
//
//        l1.head.next=n2;
//        l1.head.next.next=n3;
//
//        l1.printlist();
//        System.out.println("After inserting at first--------------------------------------");
//        Node newone=new Node(12);
//        l1.inseratFirst(newone);
//
//        l1.printlist();
//
//        System.out.println("After inserting at middle---------------------------------------");
//        Node middleone=new Node(68);
//        l1.insertmiddle(n2,middleone);
//        l1.printlist();
//
//        System.out.println("After inserting at end of linked list----------------");
//        Node endone=new Node(90);
//        l1.insertatend(endone);
//        l1.printlist();

       // System.out.println("Deleting an element ");
        //l1.deletenode(n3);

//        System.out.println("Length of linked list");
//        l1.lengthoflinkedlist(l1);
//
//        System.out.println("Search for an element in linked list");
//        System.out.println(l1.searchinlinkedlist(23));
//
//        System.out.println("Search for an element recursively");
//        System.out.println(l1.recursivesearch(l1.head,54));
//
//
//        System.out.println("Search for an element at Nth index");
//        System.out.println(l1.getElementatNthnode(1));

//        System.out.println("Insert key at tail");
//        System.out.println(l1.inserattail(55));
//        System.out.println("----------------------------------------------");
//        l1.printlist();
//        System.out.println("Insert after a particular node------------------");
//        l1.insertAfter(n2,21);
//        l1.printlist();

        System.out.println("Insert at front");
        Node n1=l1.inserfront(45);
        Node n2=l1.inserfront(52);
        Node n3 = l1.inserfront(34);
        Node n4 = l1.inserfront(45);
        //Node n5=l1.inserfront(45);
        l1.printlist(l1.head);
        //l1.removeFromUnsorted();
        //l1.printlist(l1.head);
        l1.deleteMiddleAndLastNode(n3);
        l1.printlist(l1.head);
    }


}
