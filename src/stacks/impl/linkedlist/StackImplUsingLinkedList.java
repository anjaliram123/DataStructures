package stacks.impl.linkedlist;

public class StackImplUsingLinkedList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push("happy");
        l.push("be");
        l.push("always");
        while(!l.isEmpty()) {
            System.out.println(l.pop());
        }
    }
}
