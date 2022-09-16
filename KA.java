import java.util.*;
import java.lang.*;
import java.io.*;
 
class KA {
   
    class Edge implements Comparable<Edge>
    {
        int src, dest, weight;
        public int compareTo(Edge compareEdge)
        {
            return this.weight - compareEdge.weight;
        }
    };
    class subset
    {
        int parent, rank;
    };
    int V, E; 
    Edge edge[]; 
    KA(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }
    int find(subset subsets[], int i)
    {
        if (subsets[i].parent != i)
            subsets[i].parent
                = find(subsets, subsets[i].parent);
 
        return subsets[i].parent;
    }
    void Union(subset subsets[], int x, int y)
    {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
        if (subsets[xroot].rank
            < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank
                 > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
    void KruskalMST()
    {
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge();
        subset subsets[] = new subset[V];
        for (i = 0; i < V; ++i)
            subsets[i] = new subset();
        for (int v = 0; v < V; ++v)
        {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
        i = 0; 
        while (e < V - 1)
        {
            Edge next_edge = edge[i++];
            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);
            if (x != y) {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
        }
        System.out.println("Following are the edges in " + "the constructed MST");
        System.out.println(" ");
        System.out.println("Edge     Weight");
        int minimumCost = 0;
        for (i = 0; i < e; ++i)
        {
            System.out.println(result[i].src + " -- " + result[i].dest + "    " + result[i].weight);
            minimumCost += result[i].weight;
        }
        System.out.println(" ");
        System.out.println("Minimum Cost Spanning Tree : " + minimumCost);
    }
 
   
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        int V = 5; 
        int E = 6; 
        KA graph = new KA(V, E);
 
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 4;
 
        // add edge 0-3
        graph.edge[1].src = 0;
        graph.edge[1].dest = 3;
        graph.edge[1].weight = 12;
 
        // add edge 1-2
        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 10;
 
        // add edge 1-4
        graph.edge[3].src = 1;
        graph.edge[3].dest = 4;
        graph.edge[3].weight = 7;
 
        // add edge 2-4
        graph.edge[4].src = 2;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = 5;
        
        // add edge 3-4
        graph.edge[5].src = 3;
        graph.edge[5].dest = 4;
        graph.edge[5].weight = 2;
 
        // Function call
        graph.KruskalMST();
        long endTime = System.nanoTime();
        long timeElapsed  = endTime - startTime;
        System.out.println("Execution Time in milliseconds : " +timeElapsed/1000000 + " ms");
        System.out.println("\n NAME : M.Purna Siva Sai \n REG.NO : 19BCN7076" );
        
    }
}
