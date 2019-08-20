package stacks_and_queues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    // Test variables
    PseudoQueue testQ;

    @Before public void testInit() {
        testQ = new PseudoQueue<Integer>();
    }

    @Test public void testQueueWithStackConstruct() {
        assertNull("null", testQ.s1.top);
        assertNull("null", testQ.s2.top);
    }

    @Test public void testQueueWithStacksEnqueueSingle() {
        testQ.enqueue(1);
        assertEquals("1", 1, testQ.s1.top.data);
    }

    @Test public void testQueueWithStacksdequeueSingle() {
        testQ.enqueue(1);
        assertEquals("1",1,testQ.dequeue());
    }

    @Test public void testQueueWithStacksPeek() {
        testQ.enqueue(1);
        assertEquals("1", 1, testQ.peek());
        testQ.enqueue(2);
        testQ.dequeue();
        assertEquals("2", 2, testQ.peek());
    }

    @Test public void testQueueWithStacksEnqueueMulti() {
        testQ.enqueue(1); // Front
        assertEquals("1", 1, testQ.s1.top.data);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4); // Back
        assertEquals("1", 1, testQ.peek());
    }

    @Test public void testQueueWithStacksDequeueMulti() {
        testQ.enqueue(1); // Front
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4); // Back
        assertEquals("1",1, testQ.dequeue());
        assertEquals("2",2, testQ.dequeue());
        assertEquals("3",3, testQ.dequeue());
        assertEquals("4",4, testQ.dequeue());
    }

    @Test (expected = NullPointerException.class) public void testQueueWithStacksDequeueException() {
        testQ.dequeue();
    }


}
