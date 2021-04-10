package LinkedListImplementation;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addAtStart(int data){
        Node n = new Node(data);
        if(size == 0){
            n.next = head;
            head = n;
            tail = n;
        }else{
            n.next = head;
            head = n;
            tail.next = head;
        }
        size++;
    }

    public void print(){
        Node curr = head;
        if(size<=0){
            System.out.println("Empty");
        } else {
            while (curr != head) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
        }
        System.out.print("null->");
    }
}
