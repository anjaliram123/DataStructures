package LinkedListImplementation;

public class DoublyLinkedList {

    DoublyNode head;
    DoublyNode tail;
    int size = 0;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addAtStart(int data){
      DoublyNode n = new DoublyNode(data);
      if(head==null){
          head = n;
          tail = n;
      }else{
          n.next = head;
          head.prev = n;
          head = n;
      }
      size++;
    }

    public void print(DoublyNode n){
        DoublyNode curr = n;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void addAtEnd(int data){
        DoublyNode n = new DoublyNode(data);
        if(size==0){
            head = n;
            tail = n;
        }else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public int deleteAtStart(){
        if(size==0){
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int deleteFromEnd(){
        if(size==0){
            return -1;
        }
        else if(size==1){
            deleteAtStart();
        }
        int temp = tail.data;
        tail = tail.prev;
        tail.next = null;
        return temp;
    }

    public DoublyNode addAfter(int data, DoublyNode prevNode){
        DoublyNode dataNode  = new DoublyNode(data);
        if(prevNode==null){
            System.out.println("Cannot be added");
            return null;
        }else if(prevNode == tail){
            addAtEnd(data);
        }else{
           DoublyNode temp = prevNode.next;

           prevNode.next = dataNode;

           dataNode.prev = prevNode;

           dataNode.next = temp;

           temp.prev = dataNode;
        }
         return dataNode;
    }


}
