package LinkedListImplementation;

public class FindLoopinLinkedList {

    static LinkedListL l = new LinkedListL();
    public static void main(String[] args) {
        FindLoopinLinkedList f = new FindLoopinLinkedList();
        l.head = new ListNode(10);
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(40);
        ListNode n4 = new ListNode(50);
        ListNode n5 = new ListNode(60);
        l.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        l.insertLoop(2);
        l.print(l.head);
        f.findLoop();
        System.out.println();
        l.display(l.head);

    }

    public void findLoop(){
        ListNode ptr1 = l.head;
        ListNode ptr2 = l.head.next.next;

        while(ptr1!=null){
            if(ptr1!=ptr2){
                ptr1 = ptr1.next;
                ptr2 = ptr2.next.next;
            }else{
                System.out.println("Loop found at"+ptr1.data);
                findLoopLength(ptr1,ptr2);
                breakLoop(ptr1,ptr2);
            }
        }
    }

    public void findLoopLength(ListNode one, ListNode two){
        one = one.next;
        int looplength = 1;
        while(one!=two){
            one=one.next;
            looplength++;
        }
        System.out.println("Loop length is"+looplength);
    }

    public void breakLoop(ListNode one, ListNode two){
        one = one.next;
          while(one.next!=two){
              one=one.next;
          }
          one.next = null;
        System.out.println("loop breaks");
    }
}
class LinkedListL{
    ListNode head;
    
    public LinkedListL(){
        this.head = null;
    }

    public void insertLoop(int index) {
        ListNode endNode = head;
        while(endNode.next!=null){
            endNode = endNode.next;
        }

        ListNode indexNode = head;
        while(index!=0){
            indexNode = indexNode.next;
            index--;
        }
        endNode.next = indexNode;
    }

    public void print(ListNode n){
        int count=14;
        while(n!=null && count!=0){
            System.out.print("->"+n.data);
            n=n.next;
            count--;
        }
        System.out.print("->null");
    }

    public void display(ListNode n){
        ListNode curr = n;
        while(curr!=null){
            System.out.print("->"+curr.data);
            curr = curr.next;
        }
        System.out.print("->null");
    }
}

class ListNode {
    int data;
    ListNode next;
    
    public ListNode(int data){
        this.data = data;
    }
}
