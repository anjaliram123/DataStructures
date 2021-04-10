package LinkedListImplementation;

public class LinkedList {

    Node root;

    public LinkedList(){
        this.root = null;
    }

    public void addAtStart(Node n){
        n.next = root;
        root = n;
    }

    public void addAtEnd(Node n) {
        if (root == null) {
            root = n;
        }
        else {
            Node curr = root;
            while (curr.next != null) {
                curr = curr.next;
            }
        //gives last node
        curr.next = n;
        }
    }

    public int deleteAtStart(){
        if(root==null){
            return -1;
        }
        int temp = root.data;
        root = root.next;
        return temp;
    }

    public int deletAtEnd() {
      if(root==null){
          return -1;
      }
      Node curr = root;
      Node prev = null;
      while(curr.next!=null){
          prev = curr;
          curr = curr.next;
      }
      int temp = curr.data;
      prev.next = null;
      return temp;
    }

    public void display(){
       Node curr = root;
       while(curr!=null){
           System.out.print(curr.data+"->");
           curr = curr.next;
       }
        System.out.print("null");
    }

    public void getElement(int index){

    }

    public Node reverseLinkedList(Node n){
        Node curr = n;
        Node prev = null;
        Node next;
       while(curr!=null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       root = prev;
       return prev;
    }

    public void print(Node head) {
        Node curr = head;
        System.out.print("Head->");
        while(curr!=null) {
            System.out.print(curr.data);
            System.out.print("->");
            curr= curr.next;
        }
        System.out.println("null");
    }
}
