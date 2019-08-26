package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class treeTest {

    BinaryTree<Integer> testTree;

    @Before public void testInit() {
        testTree = new BinaryTree<>();
    }

    @Test public void testConstruct() {
        assertNull(testTree.root);
    }

    @Test public void testAddSingle() {
        testTree.add(1);
        assertEquals("1",1,testTree.root.data);
    }

    @Test public void testAddThree() {
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        assertEquals("[1, 2, 3]", testTree.preOrder().toString());
    }

    @Test public void testAddTraversals() {
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        assertEquals("[1, 2, 3]", testTree.preOrder().toString());
        assertEquals("[2, 1, 3]", testTree.inOrder().toString());
        assertEquals("[2, 3, 1]", testTree.postOrder().toString());
    }
}
