package stacks_and_queues;

public class Queue<T> {
    // Instance Vars
    public Node front;
    public Node back;
    // Constructor
    public Queue() {
        this.front = null;
        this.back = null;
    }

    // Methods
    public T peek() {
        return (T)this.front.data;
    }

    public void enqueue(T data) {
        Node toAdd = new Node(data, null);
        // Add to empty queue
        if (this.front == null) {
            this.front = toAdd;
            this.back = toAdd;
            return;
        }
        // Attach to end of queue
        this.back.next = toAdd;
        // Point back to new end of queue
        this.back = this.back.next;
    }

    public T dequeue() throws NullPointerException {
        if(this.front == null) {
            throw new NullPointerException("No elements in Queue to dequeue");
        }
        T toRet = (T)this.front.data;
        this.front = this.front.next;
        // Removed last element, cut pointer to back as well.
        if(this.front == null) {
            this.back = null;
        }
        return toRet;
    }

    private void printQueue() {
        Node cur = this.front;
        System.out.println("Front");
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println("Back");
    }
}
