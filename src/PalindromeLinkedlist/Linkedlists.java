package PalindromeLinkedlist;

 class Linkedlists {

    public Node head;
    public Linkedlists()
    {
        head=null;
    }

    public void printelements(Node n)
    {
        n=head;
        System.out.print("Head->");
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null");
    }

    public boolean isPalindrome(Node n) {

        Node reverseHead = reverseLinkedlist(n);
        Node curr = n;
        while((curr!=null) && (reverseHead!=null)) {
            if(curr.data != reverseHead.data) {
                return false;
            }
                curr = curr.next;
                reverseHead = reverseHead.next;
        }
        return curr == null && reverseHead == null;
    }

    private Node reverseLinkedlist(Node n) {
        Node curr = n;
        Node head = null;
        while(curr!=null) {
            Node newNode = new Node(curr.data);
            newNode.next = head;
            head = newNode;
            curr = curr.next;
        }
        return head;
    }


}
