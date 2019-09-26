/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.*;

public class LibraryTest {
    private Graph testGraph;

    @Test
    public void testDepthFirst() {
        testGraph = new Graph();
        testGraph.addNode("a");
        testGraph.addNode("b");
        testGraph.addNode("c");
        testGraph.addNode("d");

        testGraph.addEdge("a","c",1);
        testGraph.addEdge("a","b",1);
        testGraph.addEdge("b","d",1);

        assertEquals("a - > b -> d -> c", "[a, b, d, c]", testGraph.depthFirst("a").toString());
    }

    @Test
    public void testConstruct() {
        testGraph = new Graph();
        assertEquals("empty set", "[]", testGraph.getNodes());
        testGraph.addNode("testNode");
        assertEquals("testNode", "[testNode]", testGraph.getNodes());
        testGraph.addEdge("testNode", "testNode", 1);
        assertEquals("Loop edge", "[Dest > testNode, Weight > 1]",testGraph.getNeighbors("testNode").toString());
    }

    @Test
    public void testAddNode() {
        testGraph = new Graph();
        testGraph.addNode("testNode");
        assertEquals("testNode", "[testNode]", testGraph.getNodes());
        testGraph.addNode("testNode2");
        assertEquals("testNode", "[testNode, testNode2]", testGraph.getNodes());
    }

    @Test
    public void testAddEdge() {
        testGraph = new Graph();
        testGraph.addNode("a");
        testGraph.addNode("b");
        testGraph.addEdge("a", "b", 1);
        testGraph.addEdge("a", "b", 999);
        assertEquals("Only one edge from a to b", "[Dest > b, Weight > 1]",testGraph.getNeighbors("a").toString());
    }

    @Test
    public void testGetSize() {
        testGraph = new Graph();
        testGraph.addNode("a");
        testGraph.addNode("a");
        testGraph.addNode("b");
        testGraph.addNode("c");
        assertEquals("Should not add duplicates.", 3, testGraph.size());
    }

    @Test
    public void testBreadthFirstSafe() {
        testGraph = new Graph();
        testGraph.addNode("a");
        testGraph.addNode("b");
        testGraph.addNode("c");
        testGraph.addNode("d");

        testGraph.addEdge("a","b",1);
        testGraph.addEdge("a","d",1);
        testGraph.addEdge("b","c",1);
        testGraph.addEdge("b","a",1);
        testGraph.addEdge("c","a",1);
        testGraph.addEdge("c","b",1);
        testGraph.addEdge("c","d",1);
        // a -> b && a -> d
        // b -> a && b -> c
        // c -> a && c -> b && c -> d

        assertEquals("node check", "[a, b, c, d]", testGraph.getNodes());
        assertEquals("a - > b -> c", "[a, b, d, c]", testGraph.breadthFirst("a").toString());
        assertEquals("c - > b -> a", "[c, a, b, d]", testGraph.breadthFirst("c").toString());
    }

    @Test
    public void testBreadthFirstEdge() {
        testGraph = new Graph();
        testGraph.addNode("a");
        assertEquals("One Node, No Adj List > [a]", "[a]", testGraph.breadthFirst("a").toString());
        testGraph.addNode("b");
        testGraph.addNode("c");

        testGraph.addEdge("a","b",1);
        testGraph.addEdge("b","c",1);
        testGraph.addEdge("b","a",1);
        testGraph.addEdge("c","a",1);
        testGraph.addEdge("c","b",1);

        assertEquals("node check", "[a, b, c]", testGraph.getNodes());
        assertEquals("Key DNE > []", "[]", testGraph.breadthFirst("z").toString());
    }

}
