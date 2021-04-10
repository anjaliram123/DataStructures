package stacks;

import java.util.EmptyStackException;

public class StackImpl<T> {

    public StackNode<T> top;

    public boolean isEmpty() {
        return top==null;
    }

    public void push(T data){
        StackNode<T> t = new StackNode<>(data);
        t.next = top;
        top = t;
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
