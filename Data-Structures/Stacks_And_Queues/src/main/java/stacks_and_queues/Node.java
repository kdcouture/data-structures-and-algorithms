package stacks_and_queues;

public class Node<T> {
    // Instance Vars
    protected T data;
    protected Node next;

    // Constructor (takes in data and next node pointer)
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
