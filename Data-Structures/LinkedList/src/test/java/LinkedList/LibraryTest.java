/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testConstructor() {
        assertNull(new LinkedList<Integer>().head);
        assertTrue(new LinkedListNode<Integer>(1, null).compareValue(1));
    }

    @Test public void testInsert(){
        LinkedList<Integer> testList = new LinkedList();
        testList.insert(1);
        // Verify Value and that no next is assigned on first addition.
        assertTrue("Should be true |1|", testList.head.compareValue(1));
        assertFalse("Should be false |1|",testList.head.hasNext());
        // Verify head update and next is chained correctly.
        testList.insert(2);
        assertTrue("Should be true |2|", testList.head.compareValue(2));
        assertTrue("Should be true |2|", testList.head.next.compareValue(1));
    }

    @Test public void testIncludes() {
        LinkedList<Integer> testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        assertTrue("Should find 1", testList.includes(1));
        assertTrue("Should find 4", testList.includes(4));
        assertTrue("Should find 5", testList.includes(5));
        assertFalse("Should not find 9", testList.includes(9));
        assertFalse("Should not find -1", testList.includes(-1));
    }

    @Test public void testToString() {
        LinkedList<Integer> testList = new LinkedList();
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        assertEquals("Expected '1 2 3'", "1 2 3", testList.toString());
    }

    @Test public void testAppend() {
        LinkedList<Integer> testList = new LinkedList();
        testList.append(2);
        testList.append(3);
        testList.insert(1);
        testList.append(4);
        assertEquals("Expected '1 2 3 4'", "1 2 3 4", testList.toString());
    }

    @Test public void testInsertBefore() {
        LinkedList<Integer> testList = new LinkedList();
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        try{
            // Insert before the head.
            testList.insertBefore(1, 9);
            assertEquals("Expected '9 1 2 3'", "9 1 2 3", testList.toString());
            // Insert in the list.
            testList.insertBefore(1, 8);
            assertEquals("Expected '9 8 1 2 3'", "9 8 1 2 3", testList.toString());
            // Insert at the end of the list.
            testList.insertBefore(3, 7);
            assertEquals("Expected '9 8 1 2 7 3'", "9 8 1 2 7 3", testList.toString());
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }

    @Test public void testInsertAfter() {
        LinkedList<String> testList = new LinkedList();
        testList.insert("test 3");
        testList.insert("test 2");
        testList.insert("test 1");

        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(3);
        testIntList.insert(2);
        testIntList.insert(1);
        try{
            // Test insert with strings.
            testList.insertAfter("test 2", "test 9");
            assertEquals("Expected 'test 1 test 2 test 9 test 3'", "test 1 test 2 test 9 test 3", testList.toString());

            // Test insert After head.
            testIntList.insertAfter(1,9);
            assertEquals("Expected '1 9 2 3'", "1 9 2 3", testIntList.toString());
            // Test insert After middle
            testIntList.insertAfter(2,8);
            assertEquals("Expected '1 9 2 8 3'", "1 9 2 8 3", testIntList.toString());
            // Test after tail
            testIntList.insertAfter(3,7);
            assertEquals("Expected '1 9 2 8 3 7'", "1 9 2 8 3 7", testIntList.toString());
        }
        catch (Exception e) {
            System.err.println(e);
        }
        assertEquals("Expected 'test 1 test 2 test 9 test 3'", "test 1 test 2 test 9 test 3", testList.toString());
    }

    @Test(expected = AssertionError.class) public void testInsertAfterThrow() {
        LinkedList<String> testList = new LinkedList();
        testList.insert("test 3");
        testList.insert("test 2");
        testList.insert("test 1");
        try{
            testList.insertAfter(" Not included", "test 9");
            fail();
        }
        catch (Exception e) {
            assertTrue("Should not be found and exception should be thrown.",e.equals("Value not found"));
        }
    }

    @Test(expected = AssertionError.class) public void testInsertBeforeThrow() {
        LinkedList<String> testList = new LinkedList();
        testList.insert("test 3");
        testList.insert("test 2");
        testList.insert("test 1");
        try{
            testList.insertBefore("Not included", "test 9");
            fail();
        }
        catch (Exception e) {
            assertTrue("Should not be found and exception should be thrown.",e.equals("Value not found"));
        }
    }

    @Test public void testKthFromEndSafe(){
        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(5);
        testIntList.insert(4);
        testIntList.insert(6);
        testIntList.insert(3);
        testIntList.insert(2);
        testIntList.insert(1);
        try{
            assertEquals("Should be 2", (Integer)3, testIntList.kthFromEnd(2));
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test public void testKthFromEndEdgeKIsLength(){
        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(3);
        testIntList.insert(2);
        testIntList.insert(1);
        try{
            assertEquals("Should be 3", (Integer)3, testIntList.kthFromEnd(2));
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test(expected = AssertionError.class) public void testKthFromEndKTooBig(){
        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(3);
        testIntList.insert(2);
        testIntList.insert(1);
        try{
            assertEquals("Should be 3", (Integer)3, testIntList.kthFromEnd(8));
            fail();
        }
        catch (Exception e) {
            assertTrue("k is larger than our size.", e.equals("k is invalid."));
        }
    }

    @Test(expected = AssertionError.class) public void testKthFromEndKNegative(){
        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(3);
        testIntList.insert(2);
        testIntList.insert(1);
        try{
            assertEquals("Should be 3", (Integer)3, testIntList.kthFromEnd(-1));
            fail();
        }
        catch (Exception e) {
            assertTrue("k is negative.", e.equals("k is invalid."));
        }
    }

    @Test public void testKthFromEnd1Element(){
        LinkedList<Integer> testIntList = new LinkedList();
        testIntList.insert(3);
        try{
            testIntList.kthFromEnd(0);
            assertEquals("Should be 3", (Integer)3, testIntList.kthFromEnd(0));
        }
        catch (Exception e) {
            fail();
        }
    }

}