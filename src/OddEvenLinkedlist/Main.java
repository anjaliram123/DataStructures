package OddEvenLinkedlist;

public class Main {

    public static void main(String[] args) {
        Linkedlists l = new Linkedlists();
        l.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);

        l.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;


    }
}
