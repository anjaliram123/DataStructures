package LinkedlistsRemovefromUnsorted;

public class Linkedlists {

    Node head;

     Linkedlists()
    {
        this.head=null;
    }

    public void printelements(Node n)
    {
        n=head;
        while(n!=null)
        {
            System.out.print("->"+n.data);
            n=n.next;
        }
    }


    public void removeduplicatesfromunsorted()
    {
         Node curr=head;
         Node prev=null;
         //Node temp=null;
         while(curr!=null && curr.next!=null)
         {
               prev=curr;
             //System.out.println(prev.data);
               while(prev.next!=null)
               {
                   //System.out.println(prev.data);
                   if(curr.data==prev.next.data)
                   {
                       //temp=prev.next;
                       System.out.println(curr.data);
                       System.out.println(prev.next.data);
                       prev.next=prev.next.next;
                   }
                   else
                   {
                       prev=prev.next;
                   }
               }

               curr=curr.next;
         }
    }

    public void addBefore(Node n, int val)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null && curr.data!=n.data)
        {
            prev=curr;
            curr=curr.next;
        }
        Node tmp=new Node(val);
        prev.next=tmp;
        tmp.next=curr;

        }


        public Node reverselinkedlist()
        {
            Node curr=head;
            Node prev=null;
            Node next=null;
            while(curr!=null && curr.next!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
            return prev;

        }
        public Node reverseusingrecursion(Node curr, Node prev)
        {
            Node next=null;
           if(curr.next==null)
            {
                head=curr;
                curr.next=prev;
                return head;
         }

                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            reverseusingrecursion(curr,prev);
               return head;
        }




}
