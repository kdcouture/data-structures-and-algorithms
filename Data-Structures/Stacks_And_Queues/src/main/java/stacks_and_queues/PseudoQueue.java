package stacks_and_queues;

public class PseudoQueue<T> {
    // Instance Variables
    Stack s1; // Top of s1 if front of queue, bottom of s1 if back.
    Stack s2; // Used to help maintain order of queue.
    boolean stackFlag;

    // Constructor
    public PseudoQueue() {
        this.s1 = new Stack<T>();
        this.s2 = new Stack<T>();
    }

    // Methods
    public void enqueue(T data) {
        // Place element at the top of incoming data stack
        s1.push(data);
    }

    public T dequeue() {
        if(this.s2.top == null) {
            while(this.s1.top != null) {
                this.s2.push(this.s1.pop());
            }
        }
        if (this.s2.top == null) {
            throw new NullPointerException("No elements to dequeue");
        }
        return (T)this.s2.pop();
    }


    public T peek() throws NullPointerException {
        if(this.s2.top == null) {
            while(this.s1.top != null) {
                this.s2.push(this.s1.pop());
            }
        }
        if (this.s2.top == null) {
            throw new NullPointerException("No elements to peek");
        }
        return (T)this.s2.top.data;
    }
}
