// Name: Anmol Gulati


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the implementation of CS400Graph for the individual component of Project Three: the
 * implementation of Dijsktra's Shortest Path algorithm.
 */
public class AlgorithmEngineerTests {

  private GraphADT<String> graph;

  /**
   * Instantiate graph from last week's shortest path activity.
   */
  @BeforeEach
  public void createGraph() {
    graph = new GraphADT<>();
    // insert vertices A-F
    graph.insertVertex("A");
    graph.insertVertex("B");
    graph.insertVertex("C");
    graph.insertVertex("D");
    graph.insertVertex("E");
    graph.insertVertex("F");
    // insert edges from Week 11. Shortest Path Activity
    graph.insertEdge("A", "B", 6);
    graph.insertEdge("A", "C", 2);
    graph.insertEdge("A", "D", 5);
    graph.insertEdge("B", "E", 1);
    graph.insertEdge("B", "C", 2);
    graph.insertEdge("C", "B", 3);
    graph.insertEdge("C", "F", 1);
    graph.insertEdge("D", "E", 3);
    graph.insertEdge("E", "A", 4);
    graph.insertEdge("F", "A", 1);
    graph.insertEdge("F", "D", 1);
  }

  /**
   * Checks the distance/total weight cost from the vertex A to F.
   */
  @Test
  public void testPathCostAtoF() {
    assertTrue(graph.getPathCost("A", "F") == 3);
  }

  /**
   * Checks the distance/total weight cost from the vertex A to D.
   */
  @Test
  public void testPathCostAtoD() {
    assertTrue(graph.getPathCost("A", "D") == 4);
  }

  /**
   * Checks the ordered sequence of data within vertices from the vertex A to D.
   */
  @Test
  public void testPathAtoD() {
    assertTrue(graph.shortestPath("A", "D").toString().equals("[A, C, F, D]"));
  }

  /**
   * Checks the ordered sequence of data within vertices from the vertex A to F.
   */
  @Test
  public void testPathAtoF() {
    assertTrue(graph.shortestPath("A", "F").toString().equals("[A, C, F]"));
  }

  /*
   * Checks whether the distance from A to E shortest path returns the correct amount
   */
  @Test
  public void testDistanceComputed() {
    assertTrue(graph.getPathCost("A", "E") == 6);
  }

  /*
   * Checks whether the distance from A to E shortest path returns the correct sequence of nodes in
   * which it reaches E
   */
  @Test
  public void testSequenceOfNodes() {
    assertTrue(graph.shortestPath("A", "E").toString().equals("[A, C, B, E]"));
  }

  /*
   * Checks that the path cost from B to F is 3, which is correct
   */
  @Test
  public void testPathCost() {
    assertTrue(graph.getPathCost("B", "F") == 3);
  }

  /*
   * Checks whether the Predecessor of node E from path C to E is B, which is index one in the
   * sequence returned from shortestPath method
   */
  @Test
  public void testPredecessor() {
    assertTrue(graph.shortestPath("C", "E").get(1).equals("B"));
  }
  /*
   * Checks whether correct path is outputted from B to D using shortestPath, tried new nodes
   */
  @Test
  public void testConvincer() {
    assertTrue(graph.shortestPath("B", "D").toString().equals("[B, C, F, D]"));
  }



}
