package ArraysLearning.Leetcode.thirtydaychallenge;

public class MinStack {

    Linked ll;

    public MinStack() {
         ll = new Linked();
    }

    public void push(int x) {
        Node n = new Node(x);
        if(ll.root == null) {
            ll.root = n;
        } else if(ll.root.val >= n.val){
            n.next = ll.root;
            ll.root = n;
        } else if(ll.root.val < n.val){
            ll.root.next = n;
        } else {
            Node curr = ll.root;
            Node prev = null;
            while(curr!= null) {
                if(curr.val < n.val) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = n;
                    n.next = curr;
                    break;
                }
            }
        }

    }

    public void pop() {
        if(ll.root != null) {
            Node n = ll.root.next;
            ll.root.next = null;
            ll.root = n;
        }
    }

    public int top() {
        return ll.root.val;
    }

    public int getMin() {
        return ll.root.val;
    }

    public void print() {
        Node curr = ll.root;
        while(curr!=null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

 }
