package Linkedlists;

public class Linkedlist2 {

    Node2 head;

    public void printlist(Node2 n)
    {
        n=head;//starting from head
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
}
