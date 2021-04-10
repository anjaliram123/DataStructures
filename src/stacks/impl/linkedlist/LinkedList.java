package stacks.impl.linkedlist;

public class LinkedList {

    Node root = null;

    private class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void push(String item) {
        Node newNode = new Node(item);
        Node oldNode = root;
        newNode.next = oldNode;
        root = newNode;
    }

    public String pop() {
        if(!isEmpty()) {
            Node toBeRemoved = root;
            root = root.next;
            return toBeRemoved.item;
        }
        return null;
    }
}
