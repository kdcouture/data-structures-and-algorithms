package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class get_edge_test {
    private Graph testGraph;
    @Test
    public void testGetEdge() {
        testGraph = new Graph();
        testGraph.addNode("a");
        testGraph.addNode("b");
        testGraph.addNode("c");
        testGraph.addEdge("a", "b", 2);
        testGraph.addEdge("b", "c", 2);
        assertEquals("true, $4", "true, $4", GetEdge.GetEdge(testGraph, new String[]{"a", "b", "c"}).toString());
        assertEquals("true, $2", "true, $2", GetEdge.GetEdge(testGraph, new String[]{"a", "b"}).toString());
        assertEquals("true, $2", "true, $2", GetEdge.GetEdge(testGraph, new String[]{"b", "c"}).toString());
    }
}
