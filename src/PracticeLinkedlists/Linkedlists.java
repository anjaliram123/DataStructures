package PracticeLinkedlists;

import java.util.NoSuchElementException;

public class Linkedlists {

    public Node head;


    public Linkedlists() {
        head = null;
    }

    public void printelements(Node n) {
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
    }

    public void getFirst() {
        if (head == null) {
            System.out.println("No such element");
        } else {
            System.out.println(head.data);
        }
    }

    public void lengthoflinkedlist(Node head) {
        Node curr = head;
        int count = 0;
        if (curr == null) {
            throw new NoSuchElementException();
        }
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println(count);
    }

    public void removefirst() {
        head = head.next;
        //head.next=null;
    }

    //Insert node ate end of list
    public void addatLast(int key) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        System.out.println("The last node is " + " " + n.data);
        Node last = new Node(key);
        n.next = last;
    }

    public void getlast() {
        Node n = head;
        if (head == null) {
            throw new NoSuchElementException();
        }
        while (n.next != null) {
            n = n.next;
        }
        System.out.println(n.data);
    }

    public boolean ifcontains(int key) {
        Node n = head;
        while (n != null) {
            if (n.data == key) {
                return true;
            }
            n = n.next;
        }
        return false;
    }


    public int getAtposition(int pos) {
        Node n = head;
        int count = 0;
        while (n != null) {

            if (pos == count) {
                return n.data;
            }
            n = n.next;
            count++;

        }
        return -1;

    }

    public int getlength() {
        Node n = head;
        int count = 0;
        while (n.next != null) {
            n = n.next;
            count++;
        }
        return count;
    }

    public void InsertAfter(Node node, int key) {

        Node n = head;
        while (n != null) {
            if (n.data == node.data) {
                Node tmp = new Node(key);
                tmp.next = n.next;
                n.next = tmp;

            }
            n = n.next;
        }

    }

    public void InsertBefore(Node node, int key) {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node curr = head;
        Node prev = null;
        //  Node next=null;

        while (curr != null && curr.data != node.data) {
            prev = curr;
            curr = curr.next;
        }
        System.out.println(prev.data);
        System.out.println(curr.data);
        Node temp = new Node(key);
        prev.next = temp;
        temp.next = curr;

    }

    public Node Reverse(Node n) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        n = prev;
        return n;
    }

    public Node ReverseElements(Node n) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }


    public int findmiddle(Node n) {
        int count = getlength();
        System.out.println(count);
        n = head;
        if (count % 2 == 0) {
            for (int i = 0; i <= count / 2; i++) {
                if (i == count / 2) {
                    return n.data;
                }
                n = n.next;
            }
        } else if (count % 2 != 0) {
            for (int i = 0; i <= count / 2; i++) {
                if (i == count / 2) {
                    return n.next.data;
                }
                n = n.next;
            }
        }
        return -1;
    }

    public void deletenode(Node n) {
        Node curr = head;
        Node prev = null;
        if (curr != null && curr.data == n.data) {
            return;
        }
        while (curr != null && curr.data != n.data) {

            prev = curr;
            curr = curr.next;
        }
        System.out.println(prev.data);
        System.out.println(curr.data);
        prev.next = curr.next;
    }

    public Node reversefromM2N(Node node, int m, int n)
    {
        Node curr= head;
        Node prev=null;
        int count=1;
        while(curr!=null && count!=m)
        {
           prev=curr;
           curr=curr.next;
           count++;
           }
        Node curr1=curr;
        Node prev2=null;
        Node next=null;
        Node temp=null;
        while(curr!=null && count<=n)
        {
            next=curr.next;
            curr.next=prev2;
            prev2=curr;
            curr=next;
            count++;
        }
        temp=prev2;
        prev.next=temp;
        curr1.next=curr;

        return head;
//
        }



        }





