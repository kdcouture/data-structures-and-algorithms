/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BstTest {
    BST<Integer> testTree;

    @Before public void init() {
        testTree = new BST<Integer>();
    }

    @Test public void testConstucts() {
        TreeNode<Integer> testNode = new TreeNode<Integer>(1);
        assertTrue(testNode.data == 1);
        assertNull(testNode.left);
        assertNull(testNode.right);
        assertNull(testTree.root);
    }

    @Test public void testAddSingle() {
        testTree.add(1);
        assertEquals("Root is 1", 1, testTree.root.data);
    }

    @Test public void testAddThreeSafe() {
        testTree.add(2);
        testTree.add(1);
        testTree.add(3);
        assertEquals("Root is 2", 2, testTree.root.data);
        assertEquals("Root -> left is 1", 1, testTree.root.left.data);
        assertEquals("Root -> right is 3", 3, testTree.root.right.data);
    }

    @Test public void testTraversalsSafe() {
        testTree.add(6);
        testTree.add(7);
        testTree.add(4);
        testTree.add(5);
        testTree.add(3);
        assertEquals("Pre Order","[6, 4, 3, 5, 7]", testTree.preOrder().toString());
        assertEquals("In Order","[3, 4, 5, 6, 7]", testTree.inOrder().toString());
        assertEquals("Post Order","[3, 5, 4, 7, 6]", testTree.postOrder().toString());
    }

    @Test public void testAddMultiSafe() {
        testTree.add(5);
        testTree.add(4);
        testTree.add(3);
        testTree.add(2);
        testTree.add(1);
        assertEquals("[5, 4, 3, 2, 1]", testTree.preOrder().toString());
    }

    @Test public void testContains() {
        testTree.add(7);
        testTree.add(9);
        testTree.add(4);
        testTree.add(2);
        testTree.add(1);
        assertFalse(testTree.contains(999));
        assertTrue(testTree.contains(9));
        assertTrue(testTree.contains(4));
        assertTrue(testTree.contains(2));
        assertTrue(testTree.contains(1));
    }

    @Test public void testStringBST() {
        BinaryTree<String> testTreeS = new BinaryTree<>();
        testTreeS.add("b");
        testTreeS.add("a");
        testTreeS.add("c");
        assertEquals("[b, a, c]", testTreeS.preOrder().toString());
    }

}