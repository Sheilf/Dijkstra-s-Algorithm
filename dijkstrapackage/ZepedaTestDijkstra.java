class ZepedaTestDijkstra{


   /*
      Test algorithm file.
      Weighted graph is constructed by a 2d matrix defined in GraphData.java
      Path array runs dijkstra.java using weighted graph as an argument.
      
      Files included:
         Dijkstra.java
         WeightedGraph.java
         GraphData.java
   */
   public static void main(String[] args){
      //Not tested
      //Change GraphData class name
      
      CS324WeightedGraph weightedGraph = CS324WeightedGraph.createMatrixFrom(GraphData.graph1)
      int CS324PathListADT[] = Dijstra.dijkstra(weightedGraph,0)
      
      //print path
         
   }

}