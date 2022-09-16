import java.util.*;
import java.lang.*;
import java.io.*;
 
class FWA
{
    final static int INF = 99999, V = 4;
    void floydWarshall(int graph[][])
    {
        int dist[][] = new int[V][V];
        int i, j, k;
        for (i = 0; i < V; i++)
        for (j = 0; j < V; j++)
        dist[i][j] = graph[i][j];
        for (k = 0; k < V; k++)
        {
            for (i = 0; i < V; i++)
            {
                for (j = 0; j < V; j++)
                {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                    dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        printSolution(dist);
    }
    void printSolution(int dist[][])
    {
        System.out.println("This matrix shows the shortest "+"distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                {
                    System.out.print("INF ");
                }
                else
                {
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
        long startTime = System.nanoTime();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter dimensions of graph");
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println("Enter the elements");
        int graph[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=in.nextInt();
            }
        }
        FWA a = new FWA();
        a.floydWarshall(graph);
        long endTime = System.nanoTime();
        long timeElapsed  = endTime - startTime;
        System.out.println("Execution Time in milliseconds : " +timeElapsed/1000000 + " ms");
        System.out.println("\n NAME : M.Purna Siva Sai \n REG.NO : 19BCN7076" );

    }
}