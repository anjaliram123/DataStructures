package PalindromeLinkedlist;

class Main {


    public static void main(String[] args) {

        Linkedlists l=new Linkedlists() ;
        l.head=new Node(1);
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(1);
        l.head.next=n1;
        n1.next=n2;
        n2.next=n3;
        l.printelements(l.head);
        System.out.println(l.isPalindrome(l.head));

    }
}
