package LinkedlistsRemovefromUnsorted;

public class Main {

    public static void main(String[] args) {
        Linkedlists linked=new Linkedlists();
        linked.head=new Node(32);
        Node n2=new Node(32);
        Node n3=new Node(21);
        Node n4=new Node(65);
        linked.head.next=n2;
        n2.next=n3;
        n3.next=n4;

        linked.printelements(linked.head);
        linked.removeduplicatesfromunsorted();
       // linked.printelements(linked.head);
        //linked.deletenode(n2);
       // System.out.println("Adding before----");
        //linked.addBefore(n3,46);
        //linked.printelements(linked.head);
       // Node n=linked.reverselinkedlist();
        //System.out.println("Reversing-------------------------------");
        //inked.printelements(linked.head);
       // Node nn=linked.reverseusingrecursion(linked.head,null);
        //System.out.println("Reversing-------------------------------");
        linked.printelements(linked.head);


    }
}
