import java.io.*;
import java.util.*;

class KSP {

	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}
	static int knapSack(int W, int wt[], int val[], int n)
	{
		if (n == 0 || W == 0)
			return 0;

		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		else
			return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
	}

	public static void main(String args[])
	{
        long startTime = System.nanoTime();
		int val[] = new int[] { 101 , 202 , 303 , 404};
		int wt[] = new int[] { 5 , 10 , 17 , 21};
		int W = 40;
		int n = val.length;
		System.out.println("The optimal solution is :" +knapSack(W, wt, val, n));
        long endTime = System.nanoTime();
        long timeElapsed  = endTime - startTime;
        System.out.println("Execution Time in milliseconds : " +timeElapsed/1000000 + " ms");
        System.out.println("\n NAME : M.Purna Siva Sai \n REG.NO : 19BCN7076" );

	}
}