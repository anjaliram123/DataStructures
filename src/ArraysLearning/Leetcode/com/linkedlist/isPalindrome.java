package ArraysLearning.Leetcode.com.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class isPalindrome {
    public static void main(String[] args) {
        Linked l = new Linked();
        l.root = new Node(1);
        l.root.next = new Node(2);
        l.root.next.next = new Node(4);
        l.root.next.next.next = new Node(2);
        l.root.next.next.next.next = new Node(1);
        isPalindrome ip = new isPalindrome();
        boolean res = ip.isPalindrome(l.root);
        System.out.println(res);
    }

    public boolean isPalindrome(Node head) {
        Node start = head;
        if(start==null || start.next==null) {
            return true;
        }
        Node reverse = reverseNode(head);
        while((start!= null) && (reverse!= null)) {
            if(start.val != reverse.val){
                return false;
            }
            start = start.next;
            reverse = reverse.next;
        }
        return true;
    }

    private Node reverseNode(Node head) {
        Node curr = head;
        Node prev = null;
        while(curr!=null) {
            Node newNode = new Node(curr.val);
            newNode.next = prev;
            prev = newNode;
            curr = curr.next;
        }
        return prev;
    }

}
