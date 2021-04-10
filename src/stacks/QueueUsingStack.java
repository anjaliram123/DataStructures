package stacks;

public class QueueUsingStack {

    private int front;
    StackImpl<Integer> s1 = new StackImpl<>();
    StackImpl<Integer> s2 = new StackImpl<>();

    public QueueUsingStack( ){

    }

    public void push(int x) {
        if(s1.isEmpty()){
            front = x;
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.push(x);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int val = s1.pop();
        if(!s1.isEmpty()){
            front = s1.peek();
        }
        return val;
    }

    /** Get the front element. */
    public int peek() {
        int val = 0;
       if(!s1.isEmpty()) {
           val = s1.peek();
       }
       return val;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }

}
