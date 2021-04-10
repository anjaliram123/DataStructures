package stacks;

public class MaxStack {

    Node stackNode;

    public void push(int x) {
        if(stackNode == null) {
            stackNode = new Node(x, x);
        } else {
            Node n = new Node(x, Math.max(stackNode.max,x));
            n.next = stackNode;
            stackNode = n;
        }
    }

    public int pop() {
        int val = stackNode.val;
        stackNode = stackNode.next;
        return val;
    }

    public int top() {
        return stackNode.val;
    }

    public int peekMax() {
        return stackNode.max;
    }

    public int popMax() {
        Node n = stackNode;
        int val = 0;
        Node prev = null;
        Node next = null;
        while(n!= null) {
            if(stackNode.val == stackNode.max){
                val = stackNode.val;
                stackNode = stackNode.next;
                break;
            }
            else if(n.val == stackNode.max) {
                val = n.val;
                prev.next = n.next;
                break;
            }
            prev = n;
            n = n.next;
        }
        //set Max value
       Node t = stackNode;
        int max = 0;
        while(t!= null) {
            t.max = Math.max(max, t.val);
            t= t.next;
        }
        return val;
    }
}

class Node {
    int val;
    int max;
    Node next;

    public Node(int val, int max) {
        this.val = val;
        this.max = max;
    }



}
