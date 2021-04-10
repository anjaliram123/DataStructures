package Linkedlists;

import java.math.BigInteger;

public class AddTwoNumbersLeetCode {

    public static void main(String[] args) {

        AddTwoNumbersLeetCode ac = new AddTwoNumbersLeetCode();
        Linkedlist2 l1 = new Linkedlist2();
        l1.head = new Node2(2);
        l1.head.next = new Node2(4);
        l1.head.next.next = new Node2(3);


        Linkedlist2 l2 = new Linkedlist2();
        l2.head = new Node2(5);
        l2.head.next = new Node2(6);
        l2.head.next.next = new Node2(4);

        //reverse liked lists

        Node2 l1reverse = ac.reverse(l1.head);
        Node2 l2reverse = ac.reverse(l2.head);

        String buf1 = ac.makeString(l1reverse);
        String buf2 = ac.makeString(l2reverse);

        BigInteger bi1 = new BigInteger(buf1);
        BigInteger bi2 = new BigInteger(buf2);

        BigInteger res = bi1.add(bi2);
        String ans = ""+res;
        Node2 finalNode = ac.formList(ans);

        Node2 curr = finalNode;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    private Node2 formList(String ans) {
        Node2 temp = new Node2(0);
        Node2 head = temp;
        for(int i=ans.length()-1;i>=0;i--)
        {
            int c = ans.charAt(i)-'0';
            Node2 node = new Node2(c);
            temp.next = node;
            temp = temp.next;
        }
        return head.next;

    }

    public Node2 reverse(Node2 head) {
        Node2 curr = head;
        Node2 next = null;
        Node2 prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public String makeString (Node2 head) {
        StringBuffer res = new StringBuffer();
        Node2 curr = head;
        while(curr != null) {
            res = res.append(curr.data);
            curr = curr.next;
        }

        return res.toString();
    }

}
