package queues;

public class QueueImplementation {

    private Node first, last;

    public boolean isEmpty(){
        return first==null;
    }

    public void enqueue(String val) {
        Node newNode = new Node(val);
        Node oldlast = last;
        last = newNode;
        if(isEmpty()) {
            first  = last;
        } else {
            oldlast.next = last;
        }
    }

    public String dequeue() {
     if(!isEmpty()) {
         String item = first.val;
         first = first.next;
         return item;
     }
     return null;
    }



}

class Node{
    Node next;
    String val;

    public Node(String val) {
        this.val= val;
        this.next = null;
    }
}
