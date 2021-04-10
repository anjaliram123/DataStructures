package Linkedlists;

import java.util.HashSet;

public class Linkedlist {

    public Node head;


    public void printlist(Node n)
    {
         n=head;//starting from head
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    public void inseratFirst(Node newone)
    {
        newone.next=head;
        head=newone;
    }

    public void insertmiddle(Node prev_node, Node middleone)
    {
        middleone.next=prev_node.next;
        prev_node.next=middleone;

        }


    public void insertatend(Node endone)
    {
        if(head==null)
        {

          //list is empty
            head=endone;
            System.out.println(endone.data);
            endone.next=null;
        }

        Node nn=head;
        while(nn.next!=null)
        {
            nn=nn.next;
        }
         nn.next=endone;

    }

    public void deletenode(Node delete_node)
    {
        Node n=head;
        Node prev_node=null;

        while(n!=null)
        {
            if(n.data==delete_node.data)
            {
              delete_node=prev_node.next;
              prev_node.next=delete_node.next;
              n=n.next;
            }
        }
        System.out.println(prev_node.data);

    }

    public void lengthoflinkedlist(Linkedlist l)
    {
        int count=0;
        Node n=head;

        while(n!=null)
        {
            count++;
            n=n.next;
        }


        System.out.println(count);

    }

    public boolean searchinlinkedlist(int x)
    {
        Node n=head;
        boolean result=true;

        while(n!=null)
        {

            if(n.data==x)
            {
                return true;
            }
            n=n.next;
        }
        return false;
    }


    public boolean recursivesearch(Node head,int x)
    {

        if(head==null)
        {
            return false;
        }
        else if(head.data==x) {

            return true;
        }
        else
            return recursivesearch(head.next,x);
    }


    public void deletenodekey(int key)
    {

        Node n=head;
        Node prev_node=null;

        while(n!=null)
        {
            if(n.data==key)
            {

            }
        }
    }

    public int getElementatNthnode(int index)
    {
        Node n=head;
        int count=0;

        while(n!=null)
        {
            if(count==index)
            {
               return n.data;
            }
            count++;
            n=n.next;
        }

        return 0;

    }

//    public int inserattail(int key)
//    {
//        Node n=head;
//        while(n.next!=null)
//        {
//
//            n=n.next;
//
//        }
//       // System.out.println(n.data);//74
//       // Node nee=new Node();
//        //n.next=nee;
//
//        //return nee.data;
//
//    }

    public void insertAfter(Node element,int key)
    {
        Node n=head;

        while(n!=null )
        {

//            if(n==element)
//            { Node temp=new Node(key);
//
//                  temp.next=n.next;
//                  n.next=temp;
//
//            }
            n=n.next;
        }

    }

    public Node inserfront(int data)
    {
        head=new Node(data,head);

        return head;

    }

    //using HashSet
    public void removeFromUnsorted() {
        Node curr = head;
        HashSet<Integer> s = new HashSet<>();
        Node prev = null;
        while(curr!=null) {
            if(s.contains(curr.data)){
               prev.next = curr.next;
            } else{
                s.add(curr.data);
                prev=curr;
            }
            curr = curr.next;
        }
        //Without using HashSet
//        Node curr=head;
//        Node prev = null;
//        while(curr!=null && curr.next!=null) {
//            prev=curr;
//            while(prev.next!=null) {
//                if(curr.data == prev.next.data) {
//                    System.out.println("Same re");
//                    prev.next = prev.next.next;
//                }
//                else {
//                    prev = prev.next;
//                }
//            }
//           curr=curr.next;
//        }
    }

    public void deleteMiddleAndLastNode(Node n) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null) {
            if(curr.data == n.data) {
                prev.next = prev.next.next;
            }
            else{
                prev=curr;
            }
            curr= curr.next;
        }
    }


}
