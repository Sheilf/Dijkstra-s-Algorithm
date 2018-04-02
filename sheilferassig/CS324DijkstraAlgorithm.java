
import java.util.*;
import java.lang.*;
import java.io.*;

//spt -> Shortest Path Tree
   
class CS324DijkstraAlgorithm implements ZepedaShortestPathInterface
{
    /*
      Book code equivalent:
         min = dist[v]  -> min = length[i]
         min_index = v -> vnear = i
         
         
         V is declared in the interface and determines size of our matrix dimensions
    */
    
    int minDistance(int dist[], Boolean shortestPathSet[])
    {

        int min = Integer.MAX_VALUE,
         min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (shortestPathSet[v] == false && dist[v] <= min)
            {
                min = dist[v]; 
                min_index = v;        //update vnear 
            }
        
        System.out.println("(min, min_vertex_index) -> " + "(" + min + ", " + min_index + ")"); 
        return min_index;
    }
 
    //print distance from source
    void printSolution(int dist[], int n)
    {
        
        System.out.println("(Vertex, Distance from Source)");
        for (int i = 0; i < V; i++){
            System.out.println("(" +i+", "+dist[i]+")");
        }
    }
 

    //Dijkstra implementation given an adjacency matrix & source index      
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; 
        // The distance output array. dist[i] will hold the shortest distance from src to i

        
        // shortestPathSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is final
        Boolean shortestPathSet[] = new Boolean[V];
 
        // setup
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            shortestPathSet[i] = false;
        }
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {

            int u = minDistance(dist, shortestPathSet);
 
            shortestPathSet[u] = true;
 

            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in shortestPathSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!shortestPathSet[v] && graph[u][v]!=0
                    &&
                    dist[u] != Integer.MAX_VALUE
                    &&
                    dist[u]+graph[u][v] < dist[v]
                    ){
                      dist[v] = dist[u] + graph[u][v];
                 
 
                    }
           
        }
 
        // print the constructed distance array
        System.out.println();
        printSolution(dist, V); //
    }
 }