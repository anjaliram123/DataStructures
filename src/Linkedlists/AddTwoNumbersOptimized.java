package Linkedlists;

public class AddTwoNumbersOptimized {

    public static void main(String[] args) {

        AddTwoNumbersOptimized ac = new AddTwoNumbersOptimized();
        Linkedlist2 l1 = new Linkedlist2();
        l1.head = new Node2(2);
        l1.head.next = new Node2(4);
        l1.head.next.next = new Node2(3);


        Linkedlist2 l2 = new Linkedlist2();
        l2.head = new Node2(5);
        l2.head.next = new Node2(6);
        l2.head.next.next = new Node2(4);

        Node2 finalNode = ac.addTwoNumbers(l1.head, l2.head);

        Node2 curr = finalNode;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }


    }

    public Node2 addTwoNumbers(Node2 l1, Node2 l2) {
        Node2 dummyHead = new Node2(0);
        Node2 p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node2(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node2(carry);
        }
        return dummyHead.next;
    }
    
}
