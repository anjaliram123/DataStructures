package LinkedListImplementation;

public class MergeOrCombineTwoLinkedLists {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.root= new Node(2);
        Node n1 = new Node(6);
        l1.root.next = n1;
        Node n2 = new Node(6);
        n1.next = n2;

        l2.root = new Node(1);
        Node n3 = new Node(3);
        l2.root.next = n3;
        Node n4 = new Node(17);
        n3.next = n4;
        Node n5 = new Node(19);
        n4.next = n5;

        MergeTwoSortedLists m = new MergeTwoSortedLists(l1,l2);
        Node n = m.Mergelists(l1.root, l2.root);
        LinkedList l = new LinkedList();
        l.print(n);
    }
}
class MergeTwoSortedLists{

    LinkedList l1;
    LinkedList l2;
    public MergeTwoSortedLists(LinkedList l1, LinkedList l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public Node Mergelists(Node n1, Node n2){
        Node curr1 = n1;
        Node curr2 = n2;
        Node curr3 = new Node(-1);
        Node returnNode = curr3;
        if((curr1==null) && (curr2==null)){
            return null;
        }
        while((curr1!=null) && (curr2!=null)){
            if(curr1.data >= curr2.data){
                curr3.next = curr2;
                curr2 = curr2.next;
            } else{
                curr3.next = curr1;
                curr1 = curr1.next;
            }
            curr3 = curr3.next;
        }

        if(curr1==null && curr2!=null){
            curr3.next = curr2;
        }
        if(curr2==null && curr1!=null){
            curr3.next = curr1;
        }
        return returnNode.next;
    }

    }
