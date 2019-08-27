package tree;

import org.junit.Before;
import org.junit.Test;
import tree.utilities.FizBuzTree;

import static org.junit.Assert.*;

public class fizzBuzzTest {
    BinaryTree<Object> testTree;

    @Before public void initTests() {
        testTree = new BinaryTree<Object>();
    }

    @Test public void testFizBuzSimple() {
        testTree.add(5);
        testTree.add(3);
        testTree.add(15);
        testTree.add(1);
        FizBuzTree.FizBuz(testTree);
        assertEquals("[Buzz, Fizz, 1, FizzBuzz]", testTree.preOrder().toString());
    }

    @Test public void testFizBuzComplex() {
        testTree.add(1);
        testTree.add(2);
        testTree.add(3);
        testTree.add(4);
        testTree.add(5);
        testTree.add(15);
        testTree.add(30);
        FizBuzTree.FizBuz(testTree);
        assertEquals("[1, 2, 4, Buzz, Fizz, FizzBuzz, FizzBuzz]", testTree.preOrder().toString());
    }
}
