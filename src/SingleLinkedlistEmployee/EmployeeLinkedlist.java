package SingleLinkedlistEmployee;

public class EmployeeLinkedlist {


    public EmployeeNode head;


    public void print()
    {
        EmployeeNode n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    public void addtoFront(EmployeeNode nn)
    {
        nn.next=head;
        head=nn;
    }



    public void addtoLast(EmployeeNode nn)
    {
        EmployeeNode n=head;
        if(n==null)
        {
            nn=head;
            nn.next=null;
        }

        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=nn;
        nn.next=null;

    }

    public void addtomiddle(EmployeeNode prev_node,EmployeeNode current_node)
    {
        current_node.next=prev_node.next;
        prev_node.next=current_node;

    }
}
