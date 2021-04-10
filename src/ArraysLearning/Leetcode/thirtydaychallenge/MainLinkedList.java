package ArraysLearning.Leetcode.thirtydaychallenge;

public class MainLinkedList {

    public static void main(String[] args) {
        Linked li = new Linked();
        Node n1 = new Node(1);
        li.root = n1;
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        //n1.next.next.next.next.next = new Node(6);

        Node middle = li.MiddleNode(li.root);
        System.out.println(middle.val);

    }
}
