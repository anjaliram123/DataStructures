package stacks;

public class StackNode<T> {
    public StackNode<T> next;
    public T data;

    public StackNode(T data) {
        this.data = data;
    }
}
