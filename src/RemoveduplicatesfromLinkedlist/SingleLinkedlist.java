package RemoveduplicatesfromLinkedlist;

public class SingleLinkedlist {

    public Node head;

    public SingleLinkedlist()
    {
        head=null;
    }

    public void printelements(Node n)
    {
        n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    public void deletenode(Node n)
    {
        Node curr=head;
        Node prev=null;
        if(curr.data==n.data)
        {
            return;
        }
        while(curr!=null && curr.data!=n.data)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }

    public void removeduplicates() {
        Node curr = head;
        // Node next=null;
        Node prev = null;
        Node tmp = null;
        while (curr != null && curr.next != null) {
            prev = curr;
            System.out.println(prev.data + "----------");
            //curr=curr.next;
            //System.out.println(curr.data+"-----------------");
            while (prev.next != null) {
                if (curr.data == prev.next.data) {
                    tmp = prev.next;
                    prev.next = prev.next.next;
                    // System.gc();
                } else {
                    prev = prev.next;
                }
            }
            curr = curr.next;
        }

    }
        public void removeduplicates2()
        {
             Node curr=head;
             Node prev=null;
             Node tmp=null;
             while(curr!=null && curr.next!=null)
             {
                 prev=curr;
                 System.out.println("The previous data is"+prev.data);
                 System.out.println("The current data is "+curr.data);

                 while(prev.next!=null)
                 {
                     if(curr.data==prev.next.data)
                     {
                         //tmp=prev.next;
                         System.out.println("The current data is"+curr.data);
                         System.out.println("The prev next data is"+prev.next.data);
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

        public void removevalue(int x)
        {
            Node fakehead=new Node(-1);
            fakehead.next=head;
            Node curr=head; Node prev=fakehead;
           while(curr!=null)
           {
               if(curr.data==x)
               {
                   prev.next=curr.next;
               }else
               {
                   prev=prev.next;
               }
               curr=curr.next;
           }


        }






}
