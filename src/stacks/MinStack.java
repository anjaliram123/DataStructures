package stacks;

public class MinStack {
    Integer [] stack;
    private int top;

    public MinStack() {
        stack = new Integer[10];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(int x) {
        if(top==stack.length) {
            Integer [] newArray = new Integer[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = x;
    }

    public void pop() {
        int poppedElement = -1;
        if(top > 0 && top == stack.length/4) {
            int resize = stack.length/2;
            Integer [] newArray = new Integer[resize];
            for(int i=0; i<top;i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
        }
        if(!isEmpty()) {
            poppedElement = stack[--top];
            stack[top] = null;
        }
    }

    public int top() {
        int index = top-1;
        int poppedElement = stack[index];
        return poppedElement;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<top;i++) {
            if(stack[i] < min) {
                min = stack[i];
            }
        }
        return min;
    }
}
