package RemoveduplicatesfromLinkedlist;

public class Main {

    public static void main(String[] args) {

        SingleLinkedlist s=new SingleLinkedlist();
        s.head=new Node(56);
        Node n2=new Node(65);
        Node n3=new Node(45);
        Node n4=new Node(65);
        s.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        s.printelements(s.head);
       // System.out.println("Removing duplicated from linked list----------------------");
        //s.removeduplicates();
       // System.out.println(s.head.next);
        //s.removeduplicates2();
        //s.printelements(s.head);
        System.out.println("Remove a repeated value from linked list");
        s.removevalue(65);
        s.printelements(s.head);


    }
}
