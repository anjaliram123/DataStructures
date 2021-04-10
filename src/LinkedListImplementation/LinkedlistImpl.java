package LinkedListImplementation;

public class LinkedlistImpl {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        Node n = new Node(22);
        l.addAtStart(n);
        l.addAtEnd(new Node(23));
        l.addAtEnd(new Node(24));
        l.addAtEnd(new Node(25));
        l.display();
        l.deleteAtStart();
        l.display();
        l.deletAtEnd();
        l.display();
        l.addAtEnd(new Node(26));
        l.addAtEnd(new Node(27));
        System.out.println();
        l.display();
       // l.getElement(2);
        System.out.println();
        Node node = l.reverseLinkedList(l.root);
        l.display();

    }

}
