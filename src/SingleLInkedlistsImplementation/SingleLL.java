package SingleLInkedlistsImplementation;

public class SingleLL {

    public Node head;

    public void printlist()
    {
        Node n=head;

        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }

    }
}
