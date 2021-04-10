package stacks;

public class MinStackOptimized {

    StackNode top;

    public void push(int x) {
        if (top == null) {
            top = new StackNode(x, x);
        } else {
            StackNode node = new StackNode(x, Math.min(top.min, x));
            node.next = top;
            top = node;
        }

    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }

    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }

    class StackNode {
        int val;
        int min;
        StackNode next;

        StackNode(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
