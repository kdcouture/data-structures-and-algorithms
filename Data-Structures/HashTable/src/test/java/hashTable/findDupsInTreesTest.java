package hashTable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class findDupsInTreesTest {
    BinaryTree<Integer> testTree1 = new BinaryTree<>();
    BinaryTree<Integer> testTree2 = new BinaryTree<>();
    BinaryTree<Integer> testTree3 = new BinaryTree<>();
    BinaryTree<Integer> testTree4 = new BinaryTree<>();
    BinaryTree<Integer> testTree5 = new BinaryTree<>();

    @Before
    public void initSafe() {
        testTree1.add(1);
        testTree1.add(2);
        testTree1.add(3);
        testTree1.add(4);

        testTree2.add(2);
        testTree2.add(3);
        testTree2.add(4);
        testTree2.add(5);
        testTree2.add(6);

        testTree3.add(4);

        testTree4.add(5);
    }

    @Test
    public void testTreeDupsSafe() {
        assertEquals("3 pairs", findDupsInTrees.findDuplicatesInTrees(testTree1, testTree2), "[3, 2, 4]");
        assertEquals("[4]", findDupsInTrees.findDuplicatesInTrees(testTree1, testTree3), "[4]");
        assertEquals("[4]",findDupsInTrees.findDuplicatesInTrees(testTree2, testTree3), "[4]");
        assertEquals("[5]",findDupsInTrees.findDuplicatesInTrees(testTree2, testTree4), "[5]");
        assertEquals("[]",findDupsInTrees.findDuplicatesInTrees(testTree3, testTree4), "[]");
    }

    @Test
    public void testTreeDupsEdge() {
        assertEquals("one empty",findDupsInTrees.findDuplicatesInTrees(testTree3, testTree5), "[]");
        assertEquals("two empty lists", findDupsInTrees.findDuplicatesInTrees(testTree5, testTree5), "[]");
    }


}
