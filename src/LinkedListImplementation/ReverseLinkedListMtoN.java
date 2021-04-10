package LinkedListImplementation;

public class ReverseLinkedListMtoN {

    public static void main(String[] args) {
      ReverseLinkedListMtoN r = new ReverseLinkedListMtoN();
        LinkedList l1 = new LinkedList();
        l1.root = new Node(1);
        l1.root.next = new Node(2);
        l1.root.next.next = new Node(3);
        l1.root.next.next.next = new Node(4);
        l1.root.next.next.next.next = new Node(5);

        Node n = r.reverseBetween(l1.root, 2, 4);
    }

    public Node reverseBetween(Node head, int m, int n) {
        Node fakeHead = new Node(-1);
        fakeHead.next = head;
        Node prev = fakeHead;
        Node curr = fakeHead.next;
        int i = 1;
        while (i < m) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        Node node = prev;
        while (i <= n) {
            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
            i++;
        }
        node.next.next = curr;
        node.next = prev;
        return fakeHead.next;
    }
}
