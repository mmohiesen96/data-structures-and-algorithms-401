package stack.queue;

public class Node<T> {
    public Node<T> next;
    public T data;

    public Node( T data) {
        this.next = null;
        this.data = data;
    }
}
