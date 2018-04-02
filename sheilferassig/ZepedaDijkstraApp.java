
import java.util.*;
import java.lang.*;
import java.io.*;
 
class ZepedaDijkstraApp{ 
    // Test Driver method
    public static void main (String[] args)
    {
        /* Graph: adjacency matrix */
       int graph1[][] = new int[][]{
         {0, 4, 0, 3, 16, 29, 0, 8, 0},
         {4, 0, 8, 62, 43, 6, 2, 11, 1},
         {0, 8, 0, 7, 0, 4, 0, 0, 2},
         {3, 62, 7, 0, 9, 14, 0, 0, 0},
         {16, 43, 0, 9, 0, 10, 0, 0, 0},
         {29, 3, 4, 14, 10, 0, 2, 0, 0},
         {0, 1, 0, 0, 0, 2, 0, 1, 6},
         {8, 11, 0, 0, 0, 0, 1, 0, 7},
         {0, 1, 2, 0, 0, 0, 6, 7, 0}
       };
       
        int graph2[][] = new int[][]{
         {0, 4, 0, 4, 7, 10, 0, 8, 0},
         {4, 0, 8, 0, 0, 0, 0, 11, 0},
         {0, 8, 0, 7, 0, 4, 0, 0, 2},
         {4, 0, 7, 0, 9, 14, 0, 0, 0},
         {7, 0, 0, 9, 0, 10, 0, 0, 0},
         {10, 0, 4, 14, 10, 0, 2, 0, 0},
         {0, 0, 0, 0, 0, 2, 0, 1, 6},
         {8, 11, 0, 0, 0, 0, 1, 0, 7},
         {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        
        int source = 0;
        // O (n^2)
        CS324DijkstraAlgorithm sheilferDijkstra = new CS324DijkstraAlgorithm();
        
        
        sheilferDijkstra.dijkstra(graph1, source); //=>(graph, source index)
    }
}
