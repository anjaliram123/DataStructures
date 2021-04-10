package LinkedListImplementation;

public class DoublyLLImpl {

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.addAtStart(12);
        d.addAtStart(23);
        d.addAtStart(10);
        d.addAtEnd(25);
        d.addAtEnd(4);
        d.print(d.head);
        int data = d.deleteAtStart();
        System.out.println("The deleted node is "+data);
        d.print(d.head);
        int deleteAtEnd = d.deleteFromEnd();
        System.out.println("The deleted at end node is "+deleteAtEnd);
        d.print(d.head);
       // DoublyNode after = d.addAfter(11,)
    }
}
