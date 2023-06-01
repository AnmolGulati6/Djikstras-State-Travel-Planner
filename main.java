//Name: Anmol Gulati

import java.util.List;

public class main {


  public static void main(String[] args) {
    System.out.println(createGraph());
  }
  
  public static List<String> createGraph() {
    CS400Graph<String> graph = new CS400Graph<>();
    // insert vertices A-F
    graph.insertVertex("A");
    graph.insertVertex("B");
    graph.insertVertex("C");
    graph.insertVertex("D");
    graph.insertVertex("E");
    graph.insertVertex("F");
    // insert edges from Week 11. Shortest Path Activity
    graph.insertEdge("A","B",6);
    graph.insertEdge("A","C",2);
    graph.insertEdge("A","D",5);
    graph.insertEdge("B","E",1);
    graph.insertEdge("B","C",2);
    graph.insertEdge("C","B",3);
    graph.insertEdge("C","F",1);
    graph.insertEdge("D","E",3);
    graph.insertEdge("E","A",4);
    graph.insertEdge("F","A",1);
    graph.insertEdge("F","D",1);
    
    return graph.shortestPath("B", "D");
}

}
