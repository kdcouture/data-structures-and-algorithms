package stacks_and_queues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter testShelter;
    Dog testDog;
    Cat testCat;

    @Before public void testInit() {
       testShelter = new AnimalShelter();
       testDog = new Dog("sadDog");
       testCat = new Cat("sadCat");
    }

    @Test public void testEnqueueSingle() {
        testShelter.enqueue(testDog);
        assertEquals("testDog",  Dog.class, testShelter.front.data.getClass());
    }

    @Test public void testEnqueueMulti() {
        testShelter.enqueue(testDog);
        assertEquals("testDog",  Dog.class, testShelter.dequeue().getClass());
        testShelter.enqueue(testCat);
        assertEquals("testCat",  Cat.class, testShelter.front.data.getClass());
    }

    @Test public void testDequeueSingle() {
        testShelter.enqueue(testCat);
        testShelter.dequeue();
        assertNull("Null", testShelter.front);
        assertNull("Null", testShelter.back);
    }

    @Test public void testDequeueMulti() {
        testShelter.enqueue(testCat);
        testShelter.enqueue(testDog);
        testShelter.enqueue(new Dog("sadDog2"));
        testShelter.dequeue();
        testShelter.dequeue();
        testShelter.dequeue();
        assertNull("Null", testShelter.front);
        assertNull("Null", testShelter.back);
    }

    @Test(expected = NullPointerException.class) public void testDequeueOnEmpty() {
        // Will throw exception, passes as we expect this.
        testShelter.dequeue();
    }

    @Test public void testDequeueSinglePref() {
        testShelter.enqueue(testCat);
        assertEquals("should be sadCat", "sadCat", testShelter.dequeue("Cat").name);
    }

    @Test public void testDequeueMultiPref() {
        testShelter.enqueue(testCat);
        testShelter.enqueue(testDog);
        testShelter.enqueue(new Cat("test1Cat"));
        testShelter.enqueue(new Dog("sadDog2"));
        testShelter.enqueue(new Cat("test2Cat"));
        assertEquals("should be sadDog", "sadDog", testShelter.dequeue("Dog").name);
        assertEquals("should be sadDog2", "sadDog2", testShelter.dequeue("Dog").name);
        assertEquals("should be sadCat", "sadCat", testShelter.dequeue("Cat").name);
    }

    @Test (expected = NullPointerException.class) public void testDequeuePrefOnEmpty() {
        // Will throw exception, passes as we expect this.
        testShelter.dequeue("Cat");
    }

    @Test (expected = NullPointerException.class) public void testDequeuePrefOnNoCats() {
        // Will throw exception, passes as we expect this.
        testShelter.enqueue(testDog);
        testShelter.enqueue(testDog);
        testShelter.dequeue("Cat");
    }
}
