package LinkedListImplementation;

import java.util.HashMap;

public class RemoveDuplicatesFromUnsortedLL {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(3);
        Node n6 = new Node(3);
        Node n7 = new Node(2);

        l.root.next = n2;
        n2.next = n3;n3.next = n4;
        n4.next = n5;n5.next = n6;n6.next = n7;
        RemoveDuplicatesFromUnsortedLL r = new RemoveDuplicatesFromUnsortedLL();
        Node n = r.removeDuplicates(l.root);
        l.print(n);
    }

    public Node removeDuplicates(Node n){
        Node head = n;
        HashMap<Integer,Integer> ht = new HashMap<>();
        if(n==null){
            return null;
        }
        Node curr = n;
        Node prev = null;

        while(curr!=null){
            if(ht.containsKey(curr.data)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                ht.put(curr.data,1);
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }




}
